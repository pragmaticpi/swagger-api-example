package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "InlineResponse200", propOrder =
    { "name", "empId", "location", "teamName"
})

@XmlRootElement(name="InlineResponse200")
public class InlineResponse200  {
  

  @XmlElement(name="name")
  @ApiModelProperty(example = "P", value = "")
  private String name = null;

  @XmlElement(name="emp_id")
  @ApiModelProperty(example = "1", value = "")
  private Integer empId = null;

  @XmlElement(name="location")
  @ApiModelProperty(example = "tn", value = "")
  private String location = null;

  @XmlElement(name="team_name")
  @ApiModelProperty(example = "dev", value = "")
  private String teamName = null;

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get empId
   * @return empId
  **/
  public Integer getEmpId() {
    return empId;
  }
  public void setEmpId(Integer empId) {
    this.empId = empId;
  }
 /**
   * Get location
   * @return location
  **/
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
 /**
   * Get teamName
   * @return teamName
  **/
  public String getTeamName() {
    return teamName;
  }
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

