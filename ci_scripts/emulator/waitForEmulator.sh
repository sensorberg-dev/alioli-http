#!/bin/bash
# Waits for the emulator to be booted.
# Fails when emulator is not available.
#
# From https://git.sensorberg.io/snippets/4/raw

# 11stopped: emulator available
is_booted="false"
retries=120

count=0
while [ "${is_booted}" != "11stopped" ]
do
	dev_bootcomplete=`adb shell getprop dev.bootcomplete`
  sys_boot_completed=`adb shell getprop sys.boot_completed`
  bootanim=`adb shell getprop init.svc.bootanim`

	is_booted="${dev_bootcomplete}${sys_boot_completed}${bootanim}"

	((count++)) && ((count==retries)) && break
	sleep 1
	adb_devices=`adb devices`
	echo "$count - Checking emulator boot... ${is_booted} -> ${adb_devices}"
done

if [[ "$is_booted" != "11stopped" ]]; then
  echo "Error: Emulator not available"
  exit -1
fi

echo "Disabling emulator animation and transitions"
adb shell settings put global window_animation_scale 0.0
adb shell settings put global transition_animation_scale 0.0
adb shell settings put global animator_duration_scale 0.0

echo "Emulator booted successfully"