# CS2 GSI Event Engine

CS2 GSI Event Engine is an event-driven framework for processing and extending data from the Counter-Strike 2 Game State
Integration (GSI) protocol.

## What is GSI?

**Game State Integration (GSI)** is a Valve feature that exposes real-time game state (health, weapons, round phase,
etc.) via HTTP POST, allowing external applications to safely integrate without memory reading or anti-cheat issues.

For more details,
see [Valve Developer Wiki](https://developer.valvesoftware.com/wiki/Counter-Strike:_Global_Offensive_Game_State_Integration).

## GSI Configuration

To enable Game State Integration (GSI) in CS2, you need to create a configuration file.

### Configuration File Location

Navigate to your Steam installation directory and locate the `cfg` folder:

```
<path>/Steam/steamapps/common/Counter-Strike Global Offensive/game/csgo/cfg/
```

Create a new folder named `gamestate-integration` inside the `cfg` folder, then place the configuration file
`cs2-gsi-eventengine.cfg` inside it.

> **Why create a separate folder?** The GSI configuration file can be named arbitrarily (e.g., `gsi_custom.cfg`,
`myapp.cfg`). Creating a dedicated `gamestate-integration` folder prevents naming conflicts with existing `.cfg` files
> or other GSI services.

For example, if Steam is installed at `D:/Steam`, the final path would be:

```
D:/Steam/steamapps/common/Counter-Strike Global Offensive/game/csgo/cfg/gamestate-integration/cs2-gsi-eventengine.cfg
```

### Configuration File Structure

```
"cs2-gsi-eventengine"
{
  "uri" "http://127.0.0.1:3000"    // HTTP endpoint to receive GSI data
  "timeout" "1.0"                  // Connection timeout in seconds
  "buffer"  "0.0"                  // Buffer time for data transmission
  "throttle" "0.0"                 // Minimum interval between updates
  "heartbeat" "30.0"               // Heartbeat interval in seconds
  "auth"
  {
    "token" "Auth"                 // Authentication token
  }
  "output"
  {
    "precision_time" "3"           // Decimal precision for time values
    "precision_position" "1"       // Decimal precision for position values
    "precision_vector" "3"         // Decimal precision for vector values
  }
  "data"
  {
    "map_round_wins" "1"           // History of round wins
    "map" "1"                      // Mode, map, phase, team scores
    "player_id" "1"                // SteamID
    "player_match_stats" "1"       // Scoreboard info
    "player_state" "1"             // Armor, flashed, equip_value, health, etc.
    "player_weapons" "1"           // List of player weapons and weapon state
    "provider" "1"                 // Info about the game providing info
    "round" "1"                    // Round phase and the winning team

    // Observer/Spectator data (requires spectating or observing)
    "allgrenades" "1"              // Grenade info: effecttime, lifetime, owner, position, type, velocity
    "allplayers_id" "1"            // SteamID of each player
    "allplayers_match_stats" "1"   // Scoreboard info for each player
    "allplayers_position" "1"      // Position for each player
    "allplayers_state" "1"         // Player state for each player
    "allplayers_weapons" "1"       // Weapons for each player
    "bomb" "1"                     // Bomb location, carrier, dropped status
    "phase_countdowns" "1"         // Time remaining, current phase
    "player_position" "1"          // Forward direction, position for spectated player
  }
}
```

> Adjust the configuration as needed, but it is recommended to keep the `data` section unchanged to ensure all features
> work correctly.

### Startup Steps

1. Start CS2
2. Start the CS2 GSI Event Engine application
3. The game will automatically begin sending GSI data to the configured endpoint

## Requirements

- **Java**: 25 or later
- **Gradle**: 9.4.x or later (Gradle Wrapper included)

## Building from Source

### Clone

```bash
git clone https://github.com/lzh2587379717/cs2-gsi-eventengine.git
cd cs2-gsi-eventengine
```

### Build

```bash
# Linux/macOS
./gradlew clean build

# Windows
gradlew.bat clean build
```

### Run

```bash
# Linux/macOS
./gradlew bootRun

# Windows
gradlew.bat bootRun
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
