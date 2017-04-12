package usage

import meta._


case class Works(i: Int) {
  @foo val s: String = ""
}

case class Fails(@foo s: String)
// [error] (usage/compile:compileIncremental) org.scalameta.invariants.InvariantFailedException: invariant failed:
// [error] when verifying stats.forall(((x$1: scala.meta.Stat) => scala.meta.internal.ast.Helpers.XtensionStat(x$1).isBlockStat))
// [error] found that stats.forall(((x$1: scala.meta.Stat) => scala.meta.internal.ast.Helpers.XtensionStat(x$1).isBlockStat)) is false
// [error] where stats = List(val s: String, case class Fails(s: String))
