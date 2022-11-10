package dame.model

class Field(size: Int) {

  def printField(): String = (horizontal(size) + vertical(size)) * size + horizontal(size)
  
  override def toString = printField()

  def horizontal(a: Int): String = (("+" + "-" * 3) * a) + "+\n"
  def vertical(a: Int): String = (("|" + " " * 3 ) * a) + "|\n"
}
