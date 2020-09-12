import groovy.json.JsonBuilder

def planId = "IMP2345678"
def planStatus = "Work in Progress"
def comments = "Emergency build"

println transformToJSON(planId, planStatus, comments)

def transformToJSON(String planId, String planStatus, String comments) {

    def jsonBuilder = new JsonBuilder()
    jsonBuilder.ImplemenationPlan(
        planId: planId,
        planStatus: planStatus,
        comments: comments

    )
    return jsonBuilder.toString()
}
