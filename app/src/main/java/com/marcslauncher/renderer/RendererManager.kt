package com.marcslauncher.renderer

object RendererManager {

    var currentRenderer = RenderType.ZINK

    fun switch(renderer: RenderType) {
        currentRenderer = renderer
        println("Using renderer: $renderer")
    }

}
