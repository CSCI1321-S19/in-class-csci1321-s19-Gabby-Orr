package mud

import io.StdIn._

class Player (
    private val name: String = readLine("Enter player name: "),
    private var inv: List[Item] = Nil,
    var loc: Int = ???
    ) {
  
  
  def processCommand(command:String): Unit = ???
  
  def getFromInventory(itemName:String): Option[Item] = ???
  
  def addToInventory(item:Item): Unit  = ???
  
  def inventoryListing(): String = ???
  
  def move(dir:String): Unit = ???
}

object Player {
  ???
}