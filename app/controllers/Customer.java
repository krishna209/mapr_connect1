package controllers;

import java.io.IOException;
import java.security.PrivilegedExceptionAction;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.filter.*;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
//import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.io.compress.Compression.Algorithm;
import org.apache.hadoop.hbase.util.Bytes;
import models.insertData;
import org.apache.hadoop.fs.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import java.util.*;
import javax.inject.Inject;
import static play.data.Form.form;

public class Customer extends Controller {
	
	@Inject FormFactory formFactory;
	
	private final String CUSTOMER_TABLE = "maprfs://172.17.4.61:7222/user/root/customer";
	private final String CUSTOMER_RATING_TABLE = "maprfs://172.17.4.61:7222/user/root/customer_rating";
	private final String MOVIE_GENRE_TABLE = "maprfs://172.17.4.61:7222/user/root/movie_genre";
	private final String WATCH_HISTORY_TABLE = "maprfs://172.17.4.61:7222/user/root/watch_history";
	
	public Result viewCustomer(String id) {
	 	Configuration config = null;
	   	Connection connection = null;
	   	Admin admin = null;
	   	String name = "";
	   	try {
	   		config = HBaseConfiguration.create();
	    	connection = ConnectionFactory.createConnection(config); 
	    	admin = connection.getAdmin();
	    	config.addResource(new Path("C:/Users/krishnachaitanya/Desktop/krishh.xml"));
	       	FileSystem hdfs =FileSystem.get(config);
	       	Path homeDir=hdfs.getHomeDirectory();
	       	//Print the home directory
	   	    System.out.println("Home folder -"+homeDir);
	   	    System.out.println(config.get("hbase.zookeeper.quorum"));
	   	    System.out.println("search started");
	   	    HTable table = new HTable(config, CUSTOMER_TABLE);
	   	    Get g = new Get(Bytes.toBytes(id));
	   	    org.apache.hadoop.hbase.client.Result result = table.get(g);
	   	    byte[] value = result.getValue(Bytes.toBytes("customer_details"),Bytes.toBytes("customer_name"));
	  	    name = Bytes.toString(value);
	   	    System.out.println("customer details "+name);
	  	}
	   	catch (Exception e) {
	   	      e.printStackTrace();
	    }
	    return ok(name);
	}
	
	public Result viewCustomers(String from, String to) {
	 	Configuration config = null;
	   	Connection connection = null;
	   	Admin admin = null;
	   	String name = "";
	   	//List<Cust> CustomersList = Cust.find.all();
	   	ArrayList CustomersList = new ArrayList();
	   	try {
	   		config = HBaseConfiguration.create();
	    	connection = ConnectionFactory.createConnection(config); 
	    	admin = connection.getAdmin();
	    	config.addResource(new Path("C:/Users/krishnachaitanya/Desktop/krishh.xml"));
	       	FileSystem hdfs =FileSystem.get(config);
	       	Path homeDir=hdfs.getHomeDirectory();
	       	//Print the home directory
	   	    System.out.println("Home folder -"+homeDir);
	   	    System.out.println(config.get("hbase.zookeeper.quorum"));
	   	    System.out.println("scan table started");
	   	    HTable table = new HTable(config, CUSTOMER_TABLE);
	   	    
	   	    //scan.addFamily(Bytes.toBytes("customer_details"));
	   	    if (from == null && to == null)
	   	    {
	   	    	Scan scan = new Scan();
	   	    	ResultScanner scanner = table.getScanner(scan);
	   	    	for (org.apache.hadoop.hbase.client.Result result = scanner.next(); result != null; result = scanner.next())
	   	    	{
	   	    		CustomersList.add(result);
	   	    		System.out.println("Found row : " + result);
	   	    	}
	   	    	scanner.close();
	   	    }
	   	    else {
	   	    	System.out.println("set start "+from+" and "+to);
	   	    	Scan scan = new Scan();
	   	    	scan.addFamily(Bytes.toBytes("customer_details"));
	   	    	//Filter f = new ColumnRangeFilter(Bytes.toBytes(from),true, Bytes.toBytes(to),true);
	   	    	//scan.setFilter(f);
	   	    	RowFilter filter1 = new RowFilter(CompareOp.GREATER_OR_EQUAL,new BinaryComparator(Bytes.toBytes(from)));
	   	    	RowFilter filter2 = new RowFilter(CompareOp.LESS_OR_EQUAL,new BinaryComparator(Bytes.toBytes(to)));
	   	    	scan.setFilter(filter1);
	   	    	scan.setFilter(filter2);
	   	    	System.out.println("end row");
	   	    	ResultScanner scanner = table.getScanner(scan);
	   	    	for (org.apache.hadoop.hbase.client.Result result = scanner.next(); result != null; result = scanner.next())
	   	    	{
	   	    		CustomersList.add(result);
	   	    		System.out.println("Found row : " + Bytes.toString(result.getRow()));
	   	    	}
	   	    	scanner.close();
	   	    }
	      	System.out.println(CustomersList.size());
	  	}
	   	catch (Exception e) {
	   	    e.printStackTrace();
	    }
	   	return ok("scanned");
 	}
	
	public Result getCustomer()
	{
		return ok(newCustomer.render(form(insertData.class)));
	}
	public Result insertCustomer() {
		Form<insertData> customerData = formFactory.form(insertData.class).bindFromRequest();
		insertData insD = customerData.get();
		
		Configuration config = null;
	   	Connection connection = null;
	   	Admin admin = null;
	    String id = insD.getrowKey();
	   	String col = insD.getColumnFamily();
	   	String val = insD.getCustKey();
	   	System.out.println("id "+id);
	   	System.out.println("column "+col);
	   	System.out.println("value "+val);
	   	try {		   	
	   		config = HBaseConfiguration.create();
	    	connection = ConnectionFactory.createConnection(config); 
	    	admin = connection.getAdmin();
	    	config.addResource(new Path("C:/Users/krishnachaitanya/Desktop/krishh.xml"));
	       	FileSystem hdfs =FileSystem.get(config);		
	       	Path homeDir=hdfs.getHomeDirectory();
	   	    System.out.println("Home folder -"+homeDir);
	   	    System.out.println(config.get("hbase.zookeeper.quorum"));
	   	    System.out.println("insert started");
	   	    HTable table = new HTable(config, CUSTOMER_TABLE);
	   	    Put put = new Put(Bytes.toBytes(id));
	    	put.add(Bytes.toBytes("customer_details"),Bytes.toBytes(col),Bytes.toBytes(val));
	    	table.put(put);
	    	System.out.println("inserted or updated");
	    	table.close();
	   	}
	   	catch (Exception e) {
	   		e.printStackTrace();
	   	}
	   	return ok("inserted data ");
	}
	
	/*public Result getDeleteCustomer(){
		return ok(deleteCustomerView.render(form(DeleteCustomerModel.class)));
	}*/
	
	public Result deleteCustomer(String id, String colFam) {
		/*Form<DeleteCustomerModel> customerData = formFactory.form(DeleteCustomerModel.class).bindFromRequest();
		DeleteCustomerModel delD = customerData.get();*/
		
		Configuration config = null;
	   	Connection connection = null;
	   	Admin admin = null;
	    /*String id = delD.getrowKey();
	   	String col = delD.getColumnFamily();
	   	String val = delD.getCustKey();*/
	   	System.out.println("id "+id);
	   	System.out.println("column "+colFam);
	   	try {
	   		int limitID = Integer.parseInt(id)+1;
	   		System.out.println(limitID);
	   		config = HBaseConfiguration.create();
	    	connection = ConnectionFactory.createConnection(config); 
	    	admin = connection.getAdmin();
	    	config.addResource(new Path("C:/Users/krishnachaitanya/Desktop/krishh.xml"));
	       	FileSystem hdfs =FileSystem.get(config);		
	       	Path homeDir=hdfs.getHomeDirectory();
	   	    System.out.println("Home folder -"+homeDir);
	   	    System.out.println(config.get("hbase.zookeeper.quorum"));
	   	    
	   	    //delete entry in customer table
	   		System.out.println("delete in customer table started");
	    	HTable table = new HTable(config, CUSTOMER_TABLE);
	    	Delete delete = new Delete(Bytes.toBytes(id));
	    	delete.deleteColumn(Bytes.toBytes("customer_details"),Bytes.toBytes(colFam));
	    	table.delete(delete);
	    	table.close();
	    	System.out.println("data deleted in customer table");
	    	
	    	//scan and delete customer entries in watch history table
	    	System.out.println("delete started in watch history table");
	    	HTable watchHistoryTable = new HTable(config, WATCH_HISTORY_TABLE);
	    	ArrayList<Delete> deleteList = new ArrayList<Delete>();
	    	Scan watchHistoryScan = new Scan(Bytes.toBytes(id+"_"),Bytes.toBytes(limitID+"_"));
	    	watchHistoryScan.setCaching(1000);
	    	ResultScanner watchHistoryResult = watchHistoryTable.getScanner(watchHistoryScan);
	    	try{
	    		for(org.apache.hadoop.hbase.client.Result result : watchHistoryResult){
	    			deleteList.add(new Delete(result.getRow()));
	    			if (deleteList.size() == 1000) {
	    	            // Max deletes reached, flush deletes and clear the list
	    				watchHistoryTable.delete(deleteList);
	    	            deleteList.clear();
	    			}
	    		}
	    	}
	    	finally {	
	    		watchHistoryResult.close();
	    	    if (deleteList.size() > 0) {
	    	        // Flush remaining deletes
	    	    	watchHistoryTable.delete(deleteList);
	    	    }
	    	    watchHistoryTable.close();
	    	}
	    	
	    	//scan and delete customer entries in watch history table
	    	System.out.println("delete started in watch history table");
	    	HTable customerRatingTable = new HTable(config, CUSTOMER_RATING_TABLE);
	    	ArrayList<Delete> deleteRatingList = new ArrayList<Delete>();
	    	Scan customerRatingScan = new Scan(Bytes.toBytes(id+"_"),Bytes.toBytes(limitID+"_"));
	    	customerRatingScan.setCaching(1000);
	    	ResultScanner customerRatingResult = customerRatingTable.getScanner(customerRatingScan);
	    	try{
	    		for(org.apache.hadoop.hbase.client.Result result : customerRatingResult){
	    			deleteRatingList.add(new Delete(result.getRow()));
	    			if (deleteRatingList.size() == 1000) {
	    	            // Max deletes reached, flush deletes and clear the list
	    				customerRatingTable.delete(deleteRatingList);
	    				deleteRatingList.clear();
	    			}
	    		}
	    	}
	    	finally {	
	    		customerRatingResult.close();
	    	    if (deleteRatingList.size() > 0) {
	    	        // Flush remaining deletes
	    	    	customerRatingTable.delete(deleteRatingList);
	    	    }
	    	    customerRatingTable.close();
	    	}
	   	}
		catch (Exception e) {
	   		e.printStackTrace();
	   	}
	   	return ok("deleted data ");
	}
	

}