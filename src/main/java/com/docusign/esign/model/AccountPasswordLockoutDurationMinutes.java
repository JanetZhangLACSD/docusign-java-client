package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordLockoutDurationMinutes
 */

public class AccountPasswordLockoutDurationMinutes {
  @JsonProperty("maximumMinutes")
  private String maximumMinutes = null;

  @JsonProperty("minimumMinutes")
  private String minimumMinutes = null;

  public AccountPasswordLockoutDurationMinutes maximumMinutes(String maximumMinutes) {
    this.maximumMinutes = maximumMinutes;
    return this;
  }

   /**
   * 
   * @return maximumMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumMinutes() {
    return maximumMinutes;
  }

  public void setMaximumMinutes(String maximumMinutes) {
    this.maximumMinutes = maximumMinutes;
  }

  public AccountPasswordLockoutDurationMinutes minimumMinutes(String minimumMinutes) {
    this.minimumMinutes = minimumMinutes;
    return this;
  }

   /**
   * 
   * @return minimumMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumMinutes() {
    return minimumMinutes;
  }

  public void setMinimumMinutes(String minimumMinutes) {
    this.minimumMinutes = minimumMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordLockoutDurationMinutes accountPasswordLockoutDurationMinutes = (AccountPasswordLockoutDurationMinutes) o;
    return Objects.equals(this.maximumMinutes, accountPasswordLockoutDurationMinutes.maximumMinutes) &&
        Objects.equals(this.minimumMinutes, accountPasswordLockoutDurationMinutes.minimumMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumMinutes, minimumMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordLockoutDurationMinutes {\n");
    
    sb.append("    maximumMinutes: ").append(toIndentedString(maximumMinutes)).append("\n");
    sb.append("    minimumMinutes: ").append(toIndentedString(minimumMinutes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
