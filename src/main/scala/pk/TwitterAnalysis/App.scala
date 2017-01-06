package pk.TwitterAnalysis

import scala.sys.process._
import scala.io.Source

/**
 * @author PK
 */
object App {

  def main(args: Array[String]) {
    val rlist = "ls -lr"
    val lines = rlist !! ProcessLogger(line => ())
    //println(lines)

    val filePath = getClass.getClassLoader.getResource("t8.shakespeare.txt").getPath
    Stemmer.stem()
  }

}
