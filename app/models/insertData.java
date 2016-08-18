package models;

public class insertData {
	public String row_key;
	public String column_Family;
	public String cust_Name;
	
	public void setrowKey(String row_key)
	{
		this.row_key=row_key;
	}
	public String getrowKey()
	{
		return row_key;
	}
	public void setColumnFamily(String column_Family)
	{
		this.column_Family=column_Family;
	}
	public String getColumnFamily()
	{
		return column_Family;
	}
	public void setCustKey(String cust_Name)
	{
		this.cust_Name=cust_Name;
	}
	public String getCustKey()
	{
		return cust_Name;
	}
}
