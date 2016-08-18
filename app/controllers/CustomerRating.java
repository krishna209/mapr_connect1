package controllers;

import java.io.IOException;
import java.security.PrivilegedExceptionAction;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.fs.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import java.util.*;
import javax.inject.Inject;
import static play.data.Form.form;

public class CustomerRating extends Controller{
	@Inject FormFactory formFactory;
}
