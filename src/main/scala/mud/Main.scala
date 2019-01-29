package mud

import io.StdIn._

object Main {
  def main(args:Array[String]): Unit = {
      println("Welcome to Grandma's Hell House! Enjoy your visit!")
      
      val player = new Player(readLine("Enter player name: "), ???, ???)
      var command = readLine()
      
      while (command != "quit") {
        println("lol u getting this?")
//        ??? // something about readLine command
      }
        
    }
  
}
