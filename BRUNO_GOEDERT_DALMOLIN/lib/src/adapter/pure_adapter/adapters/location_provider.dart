import 'package:patterns/src/adapter/pure_adapter/models/lat_lng.dart';

abstract class LocationProvider {
  LatLng getCurrentPosition();
}
