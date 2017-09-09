object HTTPMethod extends App {

    sealed abstract class Method(method: String) {
        def getMethod = method
    }

    case object GET extends Method("GET")
    case object POST extends Method("POST")
    case object PUT extends Method("PUT")
    case object DELETE extends Method("DELETE")
    case class Other(method: String) extends Method(method)


    def checkMethod(method: Method) = method match {
        case GET => "This is GET Method"
        case POST => "This is POST Method"
        case PUT => "This is PUT Method"
        case DELETE => "This is DELETE Method"
        case Other(x) => s"This is $x other method"
    }
    println(checkMethod(GET))
}
