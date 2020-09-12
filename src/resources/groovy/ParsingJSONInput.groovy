import groovy.json.JsonBuilder
import groovy.json.JsonSlurperClassic

public class ImplementationPlan {
    String planId
    String planStatus
    String createdBy
    String dateOfInitiation
    String comments
    String leadName
    String managerName
    String implementationDate
    String systemForInitiation
    ImplementationPlan() {}
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


//JSON slurper that parses text and convert into corresponding Object type
def parseJSON(String planData) {

    def slurper = new JsonSlurperClassic()
    def obj = slurper.parseText(planData)

    return obj

}
def implementationPlan = new ImplementationPlan('IMP2345679', 'Work in Progress', 'KevinMatthew', '2020-09-20', 'Emergency Build', 'Benny Benjamin', 'Merryln Fedora', '2020-10-01', 'wsp')

String planData = new JsonBuilder(implementationPlan).toString()

ImplementationPlan result = parseJSON(planData)
println "planId is ${result.planId } planStatus is ${result.planStatus}"
