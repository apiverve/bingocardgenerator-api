/// Response models for the Bingo Card Generator API.

/// API Response wrapper.
class BingocardgeneratorResponse {
  final String status;
  final dynamic error;
  final BingocardgeneratorData? data;

  /// Set only when the current plan locks one or more fields; null otherwise.
  final PremiumInfo? premium;

  BingocardgeneratorResponse({
    required this.status,
    this.error,
    this.data,
    this.premium,
  });

  factory BingocardgeneratorResponse.fromJson(Map<String, dynamic> json) => BingocardgeneratorResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? BingocardgeneratorData.fromJson(json['data']) : null,
    premium: json['premium'] != null ? PremiumInfo.fromJson(json['premium']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
    if (premium != null) 'premium': premium!.toJson(),
  };
}

/// Describes fields the current plan does not unlock. Locked fields arrive as null
/// in [data], and [lockedFields] names them (nested ones use dot paths).
class PremiumInfo {
  final String? message;
  final String? upgradeUrl;
  final List<String>? lockedFields;

  PremiumInfo({this.message, this.upgradeUrl, this.lockedFields});

  factory PremiumInfo.fromJson(Map<String, dynamic> json) => PremiumInfo(
    message: json['message'] as String?,
    upgradeUrl: json['upgrade_url'] as String?,
    lockedFields: (json['locked_fields'] as List?)?.map((e) => e.toString()).toList(),
  );

  Map<String, dynamic> toJson() => {
    if (message != null) 'message': message,
    if (upgradeUrl != null) 'upgrade_url': upgradeUrl,
    if (lockedFields != null) 'locked_fields': lockedFields,
  };
}

/// Response data for the Bingo Card Generator API.

class BingocardgeneratorData {
  List<BingocardgeneratorDataCardItem>? card;
  String? html;
  num? size;
  bool? freeSpace;
  num? totalCells;
  List<String>? winningPatterns;
  BingocardgeneratorDataImage? image;

  BingocardgeneratorData({
    this.card,
    this.html,
    this.size,
    this.freeSpace,
    this.totalCells,
    this.winningPatterns,
    this.image,
  });

  factory BingocardgeneratorData.fromJson(Map<String, dynamic> json) => BingocardgeneratorData(
      card: (json['card'] as List?)?.map((e) => BingocardgeneratorDataCardItem.fromJson(e)).toList(),
      html: json['html'],
      size: json['size'],
      freeSpace: json['freeSpace'],
      totalCells: json['totalCells'],
      winningPatterns: (json['winningPatterns'] as List?)?.cast<String>(),
      image: json['image'] != null ? BingocardgeneratorDataImage.fromJson(json['image']) : null,
    );
}

class BingocardgeneratorDataCardItem {
  num? 0;
  num? 1;
  num? 2;
  num? 3;
  num? 4;

  BingocardgeneratorDataCardItem({
    this.0,
    this.1,
    this.2,
    this.3,
    this.4,
  });

  factory BingocardgeneratorDataCardItem.fromJson(Map<String, dynamic> json) => BingocardgeneratorDataCardItem(
      0: json['0'],
      1: json['1'],
      2: json['2'],
      3: json['3'],
      4: json['4'],
    );
}

class BingocardgeneratorDataImage {
  String? imageName;
  String? format;
  String? downloadURL;
  num? expires;

  BingocardgeneratorDataImage({
    this.imageName,
    this.format,
    this.downloadURL,
    this.expires,
  });

  factory BingocardgeneratorDataImage.fromJson(Map<String, dynamic> json) => BingocardgeneratorDataImage(
      imageName: json['imageName'],
      format: json['format'],
      downloadURL: json['downloadURL'],
      expires: json['expires'],
    );
}

class BingocardgeneratorRequest {
  int? size;
  bool? freeSpace;
  bool? image;

  BingocardgeneratorRequest({
    this.size,
    this.freeSpace,
    this.image,
  });

  Map<String, dynamic> toJson() => {
      if (size != null) 'size': size,
      if (freeSpace != null) 'freeSpace': freeSpace,
      if (image != null) 'image': image,
    };
}
