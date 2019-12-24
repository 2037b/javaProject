package org.zjl_;

public class Customer {

  private Integer cust_id;
  private String cust_name;
  private String cust_address;
  private String cust_city;

  public void setCust_id(Integer cust_id) {
    this.cust_id = cust_id;
  }

  public void setCust_name(String cust_name) {
    this.cust_name = cust_name;
  }

  public void setCust_address(String cust_address) {
    this.cust_address = cust_address;
  }

  public void setCust_city(String cust_city) {
    this.cust_city = cust_city;
  }

  @Override
  public String toString() {
    return "Customers{" +
        "cust_id=" + cust_id +
        ", cust_name='" + cust_name + '\'' +
        ", cust_address='" + cust_address + '\'' +
        ", cust_city='" + cust_city + '\'' +
        '}';
  }
}
