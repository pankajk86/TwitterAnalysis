package pk.TwitterAnalysis

import scala.sys.process.ProcessBuilder
import scala.sys.process.ProcessLogger
import scala.sys.process.stringToProcess
import pk.TwitterAnalysis.lemma.LemmaGenerator

object Stemmer {

  def stem(): Unit = {

    val result = executeCommand("./scripts/generateTokens.sh")
    val betterResult = for (x <- result.split('\n')) yield getTokenString(x.trim)
    val lemmas = for (x <- betterResult) yield LemmaGenerator.getLemma(x)

    for (x <- lemmas) println(x)

  }

  def executeCommand(command: ProcessBuilder): String = command !! ProcessLogger(line => ())

  def getTokenString(tokenWithCount: String): String = {
    val token = tokenWithCount.split(' ') { 1 }
    token.stripPrefix("'").stripSuffix("'")
  }
}
