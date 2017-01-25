package org.funjala.automation.web.mach2.hooks;

/**
 * Created by Administrator on 1/25/2017.
 */
public class ModelSearch {

  private String internalId;
  private String name;
  private String department;
  private String jobTitle;
  private String location;
  private String lead;
  private String manager;

  public ModelSearch(String internalId, String name, String department, String jobTitle, String location, String lead, String manager) {
    this.internalId = internalId;
    this.name = name;
    this.department = department;
    this.jobTitle = jobTitle;
    this.location = location;
    this.lead = lead;
    this.manager = manager;
  }
}
