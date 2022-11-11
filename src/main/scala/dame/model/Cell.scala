package dame.model

class Cell(state: Stone, x: Int, y: Int) {
    override def toString(): String = " "+state.toString+" "
}
