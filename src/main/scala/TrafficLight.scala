object TrafficLight extends App {
    sealed abstract class Light
    case object Green extends Light
    case object Yellow extends Light
    case object Red extends Light

    def trafficLight(light: Light) = light match {
        case Green => "GO!!!"
        case Yellow => "Wait!!!"
        case Red => "Stop!!!"
    }
    println(trafficLight(Green))
}
