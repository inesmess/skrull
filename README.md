Skrull networked multiplayer turn-based gaming system
======================

## Introduction & Purpose

Skrull is a project to create a simple multiplayer gaming framework that will allow multiple clients to simultaneously play various turn-based games. Although the initial system will include very simple games, it should be extensible enough to theoretically support more complex games.

Components will include a single Game Engine that will handle overall management and individual game logic and implementations, and 1 or more Game View Clients (or Users) that connect to the central Game Engine.

Additional detail and project metrics is available at https://github.com/gjesse/skrull/wiki/Requirements

## Core Functional Requirements (see Testing document for screen shots of interface).

1. Users will choose a unique non-persistent username when first connecting to the engine.

2. Users of the system will be able to start a new game from a list of existing games. 

3. Users will be able to join an existing game that needs more players to begin.

4. Once a game has enough players, play will begin and all users will be notified.

5. As play progresses, each user will be notified of game progress, and prompted for action when it is their turn.

6. The Game Engine will support multiple simultaneous games.

7. Game View Clients will only support one active game at a time.

8. Following game completion, players wil be able to either create or join another game.

9. The system will initially support 2 or 3 simple games
   * Hello World
   * Tic Tac Toe
   * Rock, Paper, Scissors

## Non-functional Requirements

1. System will by multi-threaded, games shall not block each other.

2. System will use java RMI for communication between views and Game Engine.

3. Extensible.

4 Easy to maintain.

## Stretch goals (nice-to-haves)

1. A chat room window will be made available for conversation among players of a particular game

2. Game View Clients will retrieve updated model/view/action logic from the Game Engine without the need to update Game View Client code

3. Users will have a "Voyeur mode" option under which they can observe an existing game in progress.

## Design and Implementation Constraints

1. Must be run on a computer capable of running Java 1.6.

## References and sources of information

1. Jesse Hodges - Java syntax reference.

2. Deitel & Deitel. "Java How to Program." Unknown. 1999.

