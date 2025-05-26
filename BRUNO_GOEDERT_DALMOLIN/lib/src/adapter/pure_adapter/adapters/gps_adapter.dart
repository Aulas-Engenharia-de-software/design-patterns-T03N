import 'package:patterns/src/adapter/mock_api_response.dart';
import 'package:patterns/src/adapter/pure_adapter/adapters/location_provider.dart';
import 'package:patterns/src/adapter/pure_adapter/models/lat_lng.dart';

class GpsAdapter implements LocationProvider {
  final MockApiResponse _service;

  GpsAdapter(this._service);

  @override
  LatLng getCurrentPosition() {
    final raw = _service.getLocation();
    return LatLng(raw['lat'], raw['lng']);
  }
}
