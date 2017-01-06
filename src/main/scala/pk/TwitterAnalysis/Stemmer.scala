package pk.TwitterAnalysis

import scala.sys.process._

object Stemmer {

  def stem(): Unit = {

    val result = executeCommand("./scripts/generateTokens.sh")
    println(result)
  }

  def executeCommand(command: ProcessBuilder): String = command !! ProcessLogger(line => ())
}
