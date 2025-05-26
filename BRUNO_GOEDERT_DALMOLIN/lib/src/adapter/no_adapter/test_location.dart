import 'dart:developer';

import 'package:patterns/src/adapter/mock_api_response.dart';

class TestLocation {
  logLocation() {
    final MockApiResponse apiLocation = MockApiResponse();

    final data = apiLocation.getLocation();
    final lat = data['lat'];
    final long = data['lng'];

    log("Current Location: ${lat.toString()} ${long.toString()}");
  }
}
