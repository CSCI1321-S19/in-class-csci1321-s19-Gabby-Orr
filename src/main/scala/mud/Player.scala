package mud

import io.StdIn._

class Player (
    private val name: String = readLine("Enter player name: "),
    private var inventory: List[Item] = List.empty) {
  
  private var loc = 0
  
  
  def processCommand(command:String): Unit = {
    command match {
    case "north" => println("ayy")
    case "south" => ???
    case "east" => ???
    case "west" => ???
    case "up"  => ???
    case "down"  => ???
    case "look" => ???
    case "inv" => ???
    case "get" => ??? //  how would you add item to line?
    case "drop" => ???
    case "help" => printHelp()
    case "exit" => println("Bye, come visit Grandma again soon!")
    case _ => println("woohoo")
      }
  }

  
  def getFromInventory(itemName:String): Option[Item] = ???
  
  def addToInventory(item:Item): Unit  = ???
  
  def inventoryListing(): String = ???
  
  def move(dir:String): Unit = {
    var loc = ???
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