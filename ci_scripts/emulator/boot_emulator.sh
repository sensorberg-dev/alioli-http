#!/bin/bash
# Boot up the Android emulator

echo "Emulator booting ... "

emulator -avd emulator_default -no-audio -no-window -gpu swiftshader_indirect -debug-init -wipe-data -no-snapshot &