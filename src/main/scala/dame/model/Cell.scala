package dame.model

class Cell(state: Stone, x: String, y: Int) {
    override def toString(): String = state.toString
}
