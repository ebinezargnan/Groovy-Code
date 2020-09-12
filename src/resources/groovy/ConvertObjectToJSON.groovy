import groovy.json.JsonBuilder

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

def implementationPlan = new ImplementationPlan('IMP2345679', 'Work in Progress', 'KevinMatthew', '2020-09-20', 'Emergency Build', 'Benny Benjamin', 'Merryln Fedora', '2020-10-01', 'wsp')
println new JsonBuilder(implementationPlan).toPrettyString()
