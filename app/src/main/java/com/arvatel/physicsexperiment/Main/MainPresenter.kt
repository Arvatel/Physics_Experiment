package com.arvatel.physicsexperiment.Main

class MainPresenter(var mainView: MainView?) {
    //don't forget to override function in activity
    // must have function:
    fun onResume(){
        mainView?.showSmth()
    }

    // must have function:
    fun onDestroy(){
        mainView = null
    }

    fun askForExperiment(){

    }

}