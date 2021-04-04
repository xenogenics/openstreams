/*
 * Copyright 2021 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.05.17 at 12:19:00 PM EDT
//

package com.ibm.streams.spl.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for stateVariableType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="stateVariableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cppType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="splType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.ibm.com/xmlns/prod/streams/spl/operator/instance}expressionType" minOccurs="0"/>
 *         &lt;element name="sourceLocation" type="{http://www.ibm.com/xmlns/prod/streams/spl/operator/instance}sourceLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "stateVariableType",
    propOrder = {"name", "cppType", "splType", "value", "sourceLocation"})
public class StateVariableType {

  @XmlElement(required = true)
  protected String name;

  @XmlElement(required = true)
  protected String cppType;

  @XmlElement(required = true)
  protected String splType;

  protected ExpressionType value;

  @XmlElement(required = true)
  protected SourceLocationType sourceLocation;

  /**
   * Gets the value of the name property.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the cppType property.
   *
   * @return possible object is {@link String }
   */
  public String getCppType() {
    return cppType;
  }

  /**
   * Sets the value of the cppType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCppType(String value) {
    this.cppType = value;
  }

  /**
   * Gets the value of the splType property.
   *
   * @return possible object is {@link String }
   */
  public String getSplType() {
    return splType;
  }

  /**
   * Sets the value of the splType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSplType(String value) {
    this.splType = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link ExpressionType }
   */
  public ExpressionType getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link ExpressionType }
   */
  public void setValue(ExpressionType value) {
    this.value = value;
  }

  /**
   * Gets the value of the sourceLocation property.
   *
   * @return possible object is {@link SourceLocationType }
   */
  public SourceLocationType getSourceLocation() {
    return sourceLocation;
  }

  /**
   * Sets the value of the sourceLocation property.
   *
   * @param value allowed object is {@link SourceLocationType }
   */
  public void setSourceLocation(SourceLocationType value) {
    this.sourceLocation = value;
  }
}