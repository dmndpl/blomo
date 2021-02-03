package dmndpl.blomo

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    BlomoServer.stream[IO].compile.drain.as(ExitCode.Success)
}
