package mud

/// How will it know which room i'm in?

class Room(
    name: String,
    desc: String,
    private var items: List[Item],
    exits: Array[Int]) {
  
//  def roomie = Room.rooms
  
  def description(): String = { ???       //// (for (i<- 1 to items.length) items(i)
    s"${Room.rooms(player.loc(0))} ${Room.rooms(loc(1))}\n ${Room.rooms(loc(2}\n ${Room.rooms(loc(3))}"
  }
  
  def getExit(dir: Int): Option[Room] = {
    if (exits(dir) == -1) None else Some(Room.rooms(exits(dir)))
  }
  
  def getItem(itemName: String): Option[Item] = {
    if (???) None else Some(???)
  }
  
  def dropItem(item: Item): Unit = ???
  }  
  
object Room { 
    val rooms = readRooms()
    
    def readRooms(): Array[Room] = {
      val source = scala.io.Source.fromFile("map.txt") //iterator of characters
      val lines = source.getLines()
      val rooms = Array.fill(lines.next.trim.toInt)(readRoom(lines))// .trim keeps a space from messing shit up
      source.close()
      rooms
    }
    
    def readRoom(lines: Iterator[String]): Room = {
      val name = lines.next
      val desc = lines.next
      val items = List.fill(lines.next.trim.toInt) {
        Item(lines.next, lines.next)
       }
      val exits = lines.next.split(",").map(_.trim.toInt)
      new Room(name, desc, items, exits)
    }
    
//    def rexit(exits: Array[Int]): Array[String] = {
//      exit(i) match [
//        case 0 => Room.rooms(0)
//    }
//    }

}