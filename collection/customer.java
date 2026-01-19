package collection;

public class customer {

 public int custid;
 public String customer;
 public String custdetails;
 
 
 public customer(int custid, String customer, String custdetails) {
	super();
	this.custid = custid;
	this.customer = customer;
	this.custdetails = custdetails;
}
 public int getCustid() {
	return custid;
 }
 public void setCustid(int custid) {
	this.custid = custid;
 }
 public String getCustomer() {
	return customer;
 }
 public void setCustomer(String customer) {
	this.customer = customer;
 }
 public String getCustdetails() {
	return custdetails;
 }
 public void setCustdetails(String custdetails) {
	this.custdetails = custdetails;
 }
 
}
