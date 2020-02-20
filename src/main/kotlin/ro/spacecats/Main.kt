package ro.spacecats

import java.nio.file.Paths

data class Solution(val score: Int)

data class Input(val N: Int)

fun writeSolution(file: String, solution: Solution) {
    Paths.get("outputs", "${file}_${solution.score}.out").toFile().printWriter().apply {


    }
}

fun readInput(file: String): Input {
    val lines = Paths.get("inputs", "${file}.in").toFile().readLines()

    return Input(1)
}


fun solve(file: String) {
    writeSolution(file, greedySolve(readInput(file)))
}

fun main(args: Array<String>) {

    solve("a_")
    solve("b_")
    solve("c_")
    solve("d_")
    solve("e_")


}