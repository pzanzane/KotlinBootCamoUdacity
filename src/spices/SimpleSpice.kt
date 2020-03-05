package spices

class SimpleSpice {

    var name: String? = "curry"
    var spiciness: String? = "mild"
    var heat: Int = 0
        get() = when(spiciness){ "mild" -> 5 "hot" -> 10 else -> 0  }
        private  set
}