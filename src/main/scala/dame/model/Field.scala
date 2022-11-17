package dame.model

class Field(matrix: Matrix[Stone]):
  def this(size: Int, filling: Stone) = this(new Matrix(size, filling))
  val size = matrix.size

  def printField() = (0 until size).map(vertical(_)).mkString(horizontal(size), horizontal(size), horizontal(size))
  override def toString = printField()

  def horizontal(a: Int): String = (("+" + "-" * 3) * a) + "+\n"
  def vertical(a: Int) = matrix.row(a).map(_.toString).map(" " * ((3 - 1) / 2) + _ + " " * ((3 - 1) / 2)).mkString("|", "|", "|\n")

  //def doMove()


