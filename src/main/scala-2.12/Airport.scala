import CrazyPassenger._
import scala.collection.immutable.HashSet
import scala.util.Random

object Airport extends App {

  val sampleSize = 1000000

  var total = 0
  val numberOfRuns = 20

  for(i <- 0 until numberOfRuns) {
    val successes = List.range(0, sampleSize).par.map(_ => crazyPassengerTest()).count(_ == true)

    total += successes
    println(s"batch ${i + 1} of ${numberOfRuns} complete")
  }

  val avg = total.toDouble/(sampleSize * numberOfRuns)

  println(avg)

  def crazyPassengerTest(): Boolean = {

    val passengerSeatAssignments = Random.nextInt(planeSize) :: List.range(1, planeSize)

    val passengerSeatAssignmentsExcludingLast = passengerSeatAssignments.dropRight(1)

    val newPlane = Plane(HashSet())

    val boardedPlane = boardPlane(passengerSeatAssignmentsExcludingLast, newPlane)

    !boardedPlane.seatsTaken.contains(planeSize - 1)
  }

  def boardPlane(passengers: List[Int], plane: Plane): Plane = {

    passengers match {
      case x :: xs => boardPlane(xs, plane.addToPlane(x))
      case Nil => plane
    }
  }
}


