package dev.arbjerg.lavalink.api;

/**
 * Must be provided as a bean
 */
public interface PluginEventHandler {
    default void onWebSocketOpen(ISocketContext context) {}
    default void onWebSocketClose(ISocketContext context) {}
    default void onWebsocketMessageIn(ISocketContext context, String message) {}
    default void onWebSocketMessageOut(ISocketContext context, String message) {}
    default void onNewPlayer(ISocketContext context, IPlayer player) {}
}