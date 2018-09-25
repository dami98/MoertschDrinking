/* Autor: Colin Schneider */

package com.apphdw_entertainment.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.content.Intent.getIntent;

class MainApplicationLogic {
    private MainGui maingui;
    private MainGame mainGame;
    private List<String> listOfTaskToDos;
    private List<Integer> listOfNumberDone;
    private int intToSee;
    int currentPlayer = 0;


    MainApplicationLogic(MainGui maingui, MainGame mainGame) {
        this.maingui = maingui;
        ArrayList<String> testListe = MainGame.getMyList();
        this.mainGame = mainGame;
        listOfTaskToDos = new ArrayList<String>();
        listOfNumberDone = new ArrayList<Integer>();
        initializeTasksToDo();
        intToSee = 0;
    }

    public void loadNewTaskToDo() {
        Random rand = new Random();
        int i = rand.nextInt(9);

        if (listOfNumberDone.size() == 5) {
            maingui.setTaskToDo("Spiel Abgeschlossen");
            return;
        }
        if (listOfNumberDone.contains(i)) {
            loadNewTaskToDo();
        } else {
            maingui.setTaskToDo(MainGame.getMyList().get(currentPlayer)+ ": " +listOfTaskToDos.get(i));
            listOfNumberDone.add(i);
            intToSee++;
            currentPlayer++;
            if(currentPlayer == MainGame.getMyList().size())
            {
                currentPlayer=0;
            }
        }
    }
    void initializeTasksToDo()
    {
        listOfTaskToDos.add("Jeder, der alle Folgen von „How I met your mother“ gesehen hat, muss einen Schluck trinken.");
        listOfTaskToDos.add("Jeder trinkt mit seinem rechten Nachbarn Brüderschaft. Vorher tauscht ihr eure Getränke.");
        listOfTaskToDos.add("Einer muss seinem Nachbarn ein Glas Bier einflößen, ohne dass der Trinkende das Glas mit seinen Händen berührt.Einer, der dich nicht kennt, muss erraten, wie alt du bist. Wenn er falsch liegt, muss er mit dir Bruderschaft trinken.");
        listOfTaskToDos.add("Tauscht einmal komplett reihum die Getränke jeweils mit dem linken Sitznachbarn.");
        listOfTaskToDos.add("Haltet für 30 Sekunden alle die Luft an und steht dabei auf einem Bein. Wer vorher ausatmet oder umfällt, muss sein Glas austrinken. Einer muss natürlich die Zeit stoppen.");
        listOfTaskToDos.add("Versucht mit geschlossenen Augen einen aus eurer Runde im Gesicht zu ertasten und seinen richtigen Namen zu sagen. Wer es nicht schafft, muss etwas trinken.");
        listOfTaskToDos.add("Alle, die die Zunge rollen können, sind safe. Alle anderen müssen einen Schluck trinken.");
        listOfTaskToDos.add("Wenn eine bestimmte Person trinkt, muss auch eine andere trinken.");
        listOfTaskToDos.add("Ihr dürft nur noch mit der linken Hand trinken und wer dagegen verstößt, muss einen Schnaps trinken, den er gar nicht mag.");
        listOfTaskToDos.add("The photographer has a camera. He/she must count down from 3 loudly, whilst pointing the camera in one place. After 3, anybody not in the photograph drinks a shot.");
        listOfTaskToDos.add("Undo your invisible seat belt whenever you get up. Back on when you sit down.");
        listOfTaskToDos.add("No swearing.");
        listOfTaskToDos.add("No saying the word 'drink'");
        listOfTaskToDos.add("No pointing. You'd be surprised how much people point at each other during drinking games.");
        listOfTaskToDos.add("No first names or common nick names. Has lead to some pretty inventive and down right hurtful new nicknames over the years.");
    }
}

