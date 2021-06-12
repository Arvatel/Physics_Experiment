package com.arvatel.physicsexperiment.Main

class MainPresenter(var mainView: MainView?) {
    fun onResume(){
        mainView?.showSmth()
    }

    fun onDestroy(){
        mainView = null
    }

    fun askForExperiment(){

    }

}