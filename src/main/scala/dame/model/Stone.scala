package dame.model

enum Stone(stringRepresentation: String) {
  override def toString = stringRepresentation
  case W extends Stone("W")
  case B extends Stone("B")
  case Empty extends Stone(" ")
}
