import org.specs2.mutable._
import scala.collection.immutable.HashSet

class PlaneSpecs extends Specification {

  "BoardPassenger method" should {

    "Add passenger to plane if seat is not taken" in {
      val plane = Plane(HashSet())
      val newPlane = plane.addToPlane(1)
      newPlane.seatsTaken.size === 1
      newPlane.seatsTaken.contains(1)
    }

    "Adds passenger to random seat if seat is taken" in {
      val plane = Plane(HashSet())
      val plane1p = plane.addToPlane(1)
      val plane2p = plane1p.addToPlane(1)
      plane2p.seatsTaken.size === 2
      plane2p.seatsTaken must contain(be_>=(2))
    }
  }
}