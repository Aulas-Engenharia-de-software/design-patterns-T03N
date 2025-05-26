import 'dart:developer';

import 'package:patterns/src/adapter/mock_api_response.dart';
import 'package:patterns/src/adapter/pure_adapter/adapters/gps_adapter.dart';

class TestLocation {
  logLocation() {
    final adapter = GpsAdapter(MockApiResponse());
    final position = adapter.getCurrentPosition();

    log(
      "Current Location: ${position.latitude.toString()} ${position.longitude.toString()}",
    );
  }
}
