# HB-InheritenceMapping-SINGLE_TABLE
This design provides single table for all model classes. It will considers all  classes variables as column names and takes one extra column “Discriminator” which provides information like “Row related to which model class”. => Discriminator column can be int type or String/char type.
annotations used:
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
@DisciriminatorValue
