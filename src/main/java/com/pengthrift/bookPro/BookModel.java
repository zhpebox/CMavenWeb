/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.pengthrift.bookPro;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-01")
public class BookModel implements org.apache.thrift.TBase<BookModel, BookModel._Fields>, java.io.Serializable, Cloneable, Comparable<BookModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BookModel");

  private static final org.apache.thrift.protocol.TField BOOK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("bookName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AUTHOR_FIELD_DESC = new org.apache.thrift.protocol.TField("author", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField YEAR_FIELD_DESC = new org.apache.thrift.protocol.TField("year", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BookModelStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BookModelTupleSchemeFactory();

  public java.lang.String bookName; // required
  public java.lang.String author; // required
  public int year; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOK_NAME((short)1, "bookName"),
    AUTHOR((short)2, "author"),
    YEAR((short)3, "year");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BOOK_NAME
          return BOOK_NAME;
        case 2: // AUTHOR
          return AUTHOR;
        case 3: // YEAR
          return YEAR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __YEAR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOK_NAME, new org.apache.thrift.meta_data.FieldMetaData("bookName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTHOR, new org.apache.thrift.meta_data.FieldMetaData("author", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.YEAR, new org.apache.thrift.meta_data.FieldMetaData("year", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BookModel.class, metaDataMap);
  }

  public BookModel() {
  }

  public BookModel(
    java.lang.String bookName,
    java.lang.String author,
    int year)
  {
    this();
    this.bookName = bookName;
    this.author = author;
    this.year = year;
    setYearIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BookModel(BookModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBookName()) {
      this.bookName = other.bookName;
    }
    if (other.isSetAuthor()) {
      this.author = other.author;
    }
    this.year = other.year;
  }

  public BookModel deepCopy() {
    return new BookModel(this);
  }

  @Override
  public void clear() {
    this.bookName = null;
    this.author = null;
    setYearIsSet(false);
    this.year = 0;
  }

  public java.lang.String getBookName() {
    return this.bookName;
  }

  public BookModel setBookName(java.lang.String bookName) {
    this.bookName = bookName;
    return this;
  }

  public void unsetBookName() {
    this.bookName = null;
  }

  /** Returns true if field bookName is set (has been assigned a value) and false otherwise */
  public boolean isSetBookName() {
    return this.bookName != null;
  }

  public void setBookNameIsSet(boolean value) {
    if (!value) {
      this.bookName = null;
    }
  }

  public java.lang.String getAuthor() {
    return this.author;
  }

  public BookModel setAuthor(java.lang.String author) {
    this.author = author;
    return this;
  }

  public void unsetAuthor() {
    this.author = null;
  }

  /** Returns true if field author is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthor() {
    return this.author != null;
  }

  public void setAuthorIsSet(boolean value) {
    if (!value) {
      this.author = null;
    }
  }

  public int getYear() {
    return this.year;
  }

  public BookModel setYear(int year) {
    this.year = year;
    setYearIsSet(true);
    return this;
  }

  public void unsetYear() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  /** Returns true if field year is set (has been assigned a value) and false otherwise */
  public boolean isSetYear() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  public void setYearIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __YEAR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BOOK_NAME:
      if (value == null) {
        unsetBookName();
      } else {
        setBookName((java.lang.String)value);
      }
      break;

    case AUTHOR:
      if (value == null) {
        unsetAuthor();
      } else {
        setAuthor((java.lang.String)value);
      }
      break;

    case YEAR:
      if (value == null) {
        unsetYear();
      } else {
        setYear((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BOOK_NAME:
      return getBookName();

    case AUTHOR:
      return getAuthor();

    case YEAR:
      return getYear();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BOOK_NAME:
      return isSetBookName();
    case AUTHOR:
      return isSetAuthor();
    case YEAR:
      return isSetYear();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BookModel)
      return this.equals((BookModel)that);
    return false;
  }

  public boolean equals(BookModel that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_bookName = true && this.isSetBookName();
    boolean that_present_bookName = true && that.isSetBookName();
    if (this_present_bookName || that_present_bookName) {
      if (!(this_present_bookName && that_present_bookName))
        return false;
      if (!this.bookName.equals(that.bookName))
        return false;
    }

    boolean this_present_author = true && this.isSetAuthor();
    boolean that_present_author = true && that.isSetAuthor();
    if (this_present_author || that_present_author) {
      if (!(this_present_author && that_present_author))
        return false;
      if (!this.author.equals(that.author))
        return false;
    }

    boolean this_present_year = true;
    boolean that_present_year = true;
    if (this_present_year || that_present_year) {
      if (!(this_present_year && that_present_year))
        return false;
      if (this.year != that.year)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBookName()) ? 131071 : 524287);
    if (isSetBookName())
      hashCode = hashCode * 8191 + bookName.hashCode();

    hashCode = hashCode * 8191 + ((isSetAuthor()) ? 131071 : 524287);
    if (isSetAuthor())
      hashCode = hashCode * 8191 + author.hashCode();

    hashCode = hashCode * 8191 + year;

    return hashCode;
  }

  @Override
  public int compareTo(BookModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBookName()).compareTo(other.isSetBookName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBookName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bookName, other.bookName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAuthor()).compareTo(other.isSetAuthor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.author, other.author);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetYear()).compareTo(other.isSetYear());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYear()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.year, other.year);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BookModel(");
    boolean first = true;

    sb.append("bookName:");
    if (this.bookName == null) {
      sb.append("null");
    } else {
      sb.append(this.bookName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("author:");
    if (this.author == null) {
      sb.append("null");
    } else {
      sb.append(this.author);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("year:");
    sb.append(this.year);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BookModelStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BookModelStandardScheme getScheme() {
      return new BookModelStandardScheme();
    }
  }

  private static class BookModelStandardScheme extends org.apache.thrift.scheme.StandardScheme<BookModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BookModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOOK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bookName = iprot.readString();
              struct.setBookNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AUTHOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.author = iprot.readString();
              struct.setAuthorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // YEAR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.year = iprot.readI32();
              struct.setYearIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BookModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bookName != null) {
        oprot.writeFieldBegin(BOOK_NAME_FIELD_DESC);
        oprot.writeString(struct.bookName);
        oprot.writeFieldEnd();
      }
      if (struct.author != null) {
        oprot.writeFieldBegin(AUTHOR_FIELD_DESC);
        oprot.writeString(struct.author);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(YEAR_FIELD_DESC);
      oprot.writeI32(struct.year);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BookModelTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BookModelTupleScheme getScheme() {
      return new BookModelTupleScheme();
    }
  }

  private static class BookModelTupleScheme extends org.apache.thrift.scheme.TupleScheme<BookModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BookModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBookName()) {
        optionals.set(0);
      }
      if (struct.isSetAuthor()) {
        optionals.set(1);
      }
      if (struct.isSetYear()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBookName()) {
        oprot.writeString(struct.bookName);
      }
      if (struct.isSetAuthor()) {
        oprot.writeString(struct.author);
      }
      if (struct.isSetYear()) {
        oprot.writeI32(struct.year);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BookModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.bookName = iprot.readString();
        struct.setBookNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.author = iprot.readString();
        struct.setAuthorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.year = iprot.readI32();
        struct.setYearIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

