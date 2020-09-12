import groovy.json.JsonGenerator
import groovy.json.JsonGenerator.Converter

 class ImplementationPlan {
    String planId
    String planStatus
    String createdBy
    String dateOfInitiation
    String comments
    String leadName
    String managerName
    String implementationDate
    String systemForInitiation

    ImplementationPlan(String planId,
        String planStatus,
        String createdBy,
        String dateOfInitiation,
        String comments,
        String leadName,
        String managerName,
        String implementationDate,
        String systemForInitiation) {
        this.planId = planId
        this.planStatus = planStatus
        this.createdBy = createdBy
        this.dateOfInitiation = dateOfInitiation
        this.comments = comments
        this.leadName = leadName
        this.managerName = managerName
        this.implementationDate = implementationDate
        this.systemForInitiation = systemForInitiation
    }

}

def implementationPlan = new ImplementationPlan('IMP2345679', 'Work in Progress', 'KevinMatthew', '2020-09-20', null, 'Benny Benjamin', 'Merryln Fedora', '2020-10-01', null)
def jsonOutputDefault = new JsonGenerator.Options().build()

// Print all by default
def jsonResult = jsonOutputDefault.toJson(implementationPlan)

println "Default JSON output include null and all Fields - ${jsonResult }"

// Exlude null ,leadName,managerName, and createdBy
def jsonOutput =
    new JsonGenerator.Options()
    .excludeNulls().excludeFieldsByName('leadName').excludeFieldsByName('managerName').excludeFieldsByName('createdBy').build()

def jsonCustomizedResult = jsonOutput.toJson(implementationPlan)
println "The customizing output after exclude null and fields - ${jsonCustomizedResult}"
