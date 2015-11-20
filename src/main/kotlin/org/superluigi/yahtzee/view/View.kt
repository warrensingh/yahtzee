package org.superluigi.yahtzee.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.stage.Stage

class View : Application() {

    override fun start(primaryStage: Stage) {

        val grid = GridPane()
        grid.gridLinesVisibleProperty().set(true)

        Dice.addToGrid(grid)

        RollButton.addToGrid(grid)

        ScoreSheet.addToGrid(grid)

        Dialog.addToGrid(grid)

        val scene = Scene(grid, 750.0, 1000.0)

        primaryStage.title = "YAHTZEE!"

        primaryStage.scene = scene

        primaryStage.show()

    }

}