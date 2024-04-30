//package com.GradeAnalyzer;
//
//import javax.xml.bind.annotation.*;
//
//@XmlRootElement(name = "HealthReport")
//@XmlAccessorType(XmlAccessType.FIELD)
//public class HealthReport {
//
//    @XmlElement(name = "bloodPressure")
//    private Integer bloodPressure;
//
//    @XmlElement(name="bmi")
//    private Float bmi;
//
//    @XmlElement(name="cholesterolLDL")
//    private Integer cholesterolLDL;
//
//    @XmlElement(name="cholesterolHDL")
//    private Integer cholesterolHDL;
//
//    @XmlElement(name="bloodGlucoseHemoglobin")
//    private Integer bloodGlucoseHemoglobin;
//
//    @XmlElement(name="triglycerides")
//    private Integer triglycerides;
//
//
//    public Integer getBloodPressure() {
//        return bloodPressure;
//    }
//
//
//    public Float getBMI() {
//        return bmi;
//    }
//
//
//    public Integer getCholesterolLDL() {
//        return cholesterolLDL;
//    }
//
//
//    public Integer getCholesterolHDL() {
//        return cholesterolHDL;
//    }
//
//
//    public Integer getBloodGlucoseHemoglobin() {
//        return bloodGlucoseHemoglobin;
//    }
//
//
//    public Integer geTriglycerides() {
//        return triglycerides;
//    }
//
//
//    public void setBloodPressure(Integer bloodPressure) {
//         this.bloodPressure = bloodPressure;
//    }
//
//    public void setBMI(Float bmi) {
//         this.bmi = bmi;
//    }
//
//    public void setCholesterolLDL(Integer cholesterolLDL) {
//        this.cholesterolLDL = cholesterolLDL;
//    }
//
//
//    public void setCholesterolHDL(Integer cholesterolHDL) {
//        this.cholesterolHDL =  cholesterolHDL;
//    }
//
//    public void setBloodGlucoseHemoglobin(Integer bloodGlucoseHemoglobin) {
//        this.bloodGlucoseHemoglobin = bloodGlucoseHemoglobin;
//    }
//
//    public void seTriglycerides(Integer triglycerides) {
//        this.triglycerides = triglycerides;
//    }
//
//    @Override
//    public String toString() {
//        return "bloodPressure =" + bloodPressure + "";
//    }
//
//}