package mud

import io.StdIn._

class Player (
    val name: String = readLine(s"Enter player name: \n"),
    private var inventory: List[Item] = List.empty,
    private var loc: Room = Room.rooms(0)
) {
    
  
  def processCommand(command:String): Unit = {
    command match {
    case "north" => move(0)
    case "south" => move(1)
    case "east" => move(2)
    case "west" => move(3)
    case "up"  => move(4)
    case "down"  => move(5)
    case "look" => println(Room.rooms(0).description)
    case "inv" => ???
    case "get" => ??? //  how would you add item to line?
    case "drop" => ???
    case "help" => printHelp()
    case "exit" => println("Bye, come visit Grandma again soon!\n")
    case _ => println("woohoo")
      }
  }

  
  def getFromInventory(itemName:String): Option[Item] = ???
  
  def addToInventory(item:Item): Unit  = ???
  
  def inventoryListing(): String = ???
  
  def move(dir:String): Unit = {
    Room.getExit(dir)
//    var loc = ???
  }
  
  def printHelp(): Unit = {
    println("Only the following commands are supported:\n")
    println(s"'north', 'south', 'east', 'west', 'up', 'down'  -- Movement; get from one room to another")
    println(s"'look'                                          -- See descripton of current room, along with items in room")
    println("'inv'                                           -- See contents of your inventory")
    println("'get {item}'                                    -- Type get followed by desired item to add that item to inventory")
    println("'drop {item}'                                   -- Type drop followed by unwanted item to drop that item from inventory")
    println("'exit'                                          -- Leave the game")   
  }
}

//object Player {
//  
//}