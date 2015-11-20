package org.superluigi.yahtzee.view

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.image.Image
import javafx.scene.layout.*

object Dice {

    val diceGrid = GridPane()
    val diceGridColumn = ColumnConstraints()
    val diceGridRow = RowConstraints()
    val dieColumn = ColumnConstraints()
    val diceRow = RowConstraints()
    val dice = Array(5, { Button() })

    fun addToGrid(grid: GridPane) {

        val image = Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Dice-6a.svg/557px-Dice-6a.svg.png")

        val backgroundImage =
            BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize(100.0, 100.0, true, true, true, true)
            )

        val background = Background(backgroundImage)

        diceGrid.gridLinesVisibleProperty().set(true)

        diceGridColumn.percentWidth = 100.0

        diceGridRow.percentHeight = 15.0

        grid.columnConstraints.add(diceGridColumn)

        grid.rowConstraints.add(diceGridRow)

        dieColumn.percentWidth = 20.0

        diceRow.percentHeight = 100.0

        for (i in 1..5) {

            diceGrid.columnConstraints.add(dieColumn)

        }

        diceGrid.rowConstraints.add(diceRow)

        dice.forEachIndexed { index, die ->

            die.maxWidth = Double.MAX_VALUE
            die.maxHeight = Double.MAX_VALUE

            die.background = background

            die.onAction =
                object : EventHandler<ActionEvent> {

                    override fun handle(event: ActionEvent) {

                        println("Six.")

                    }

                }

            diceGrid.add(die, index, 0)

        }

        grid.add(diceGrid, 0, 0)

    }
}

