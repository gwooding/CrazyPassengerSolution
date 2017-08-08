import CrazyPassenger._
import scala.util.Random

case class Plane(seatsTaken: Set[Int]) {

  def addToPlane(seat: Int): Plane = {
    if (seatsTaken.contains(seat)) {

      val freeSeats = (seats -- seatsTaken).toList

      val seatIndex = Random.nextInt(freeSeats.size)

      Plane(seatsTaken + freeSeats(seatIndex))

    } else {
      Plane(seatsTaken + seat)
    }
  }

}
