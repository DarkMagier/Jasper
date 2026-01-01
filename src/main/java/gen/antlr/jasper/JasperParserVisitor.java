// Generated from /Users/auth/IdeaProjects/Jasper/src/main/antlr/grammar/JasperParser.g4 by ANTLR 4.13.2
package gen.antlr.jasper;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JasperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JasperParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JasperParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(JasperParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JasperParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSingle(JasperParser.ImportSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportOnDemand(JasperParser.ImportOnDemandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStaticSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStaticSingle(JasperParser.ImportStaticSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStaticOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStaticOnDemand(JasperParser.ImportStaticOnDemandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(JasperParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportQualified}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportQualified(JasperParser.FromImportQualifiedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportString(JasperParser.FromImportStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportRawString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportRawString(JasperParser.FromImportRawStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportTripleString(JasperParser.FromImportTripleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportRawTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportRawTripleString(JasperParser.FromImportRawTripleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportClauseAll}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClauseAll(JasperParser.ImportClauseAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportClauseItems}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClauseItems(JasperParser.ImportClauseItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(JasperParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopLevelDeclarationItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclarationItem(JasperParser.TopLevelDeclarationItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopLevelStatementItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStatementItem(JasperParser.TopLevelStatementItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopDeclarationClass}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationClass(JasperParser.TopDeclarationClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopDeclarationInterface}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationInterface(JasperParser.TopDeclarationInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopDeclarationFunction}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationFunction(JasperParser.TopDeclarationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopDeclarationEmptyDeclaration}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationEmptyDeclaration(JasperParser.TopDeclarationEmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopDeclarationVariable}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationVariable(JasperParser.TopDeclarationVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelVariableDeclaration(JasperParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftKeyword(JasperParser.SoftKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftWhen(JasperParser.SoftWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftThen(JasperParser.SoftThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftLabel(JasperParser.SoftLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softDecorate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftDecorate(JasperParser.SoftDecorateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftFrom(JasperParser.SoftFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftAs(JasperParser.SoftAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftCast(JasperParser.SoftCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softJson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftJson(JasperParser.SoftJsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftGet(JasperParser.SoftGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftSet(JasperParser.SoftSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftOr(JasperParser.SoftOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftAnd(JasperParser.SoftAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#softNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftNot(JasperParser.SoftNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JasperParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(JasperParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(JasperParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OctalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalLiteral(JasperParser.OctalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(JasperParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(JasperParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RawStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringLiteral(JasperParser.RawStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegexLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexLiteral(JasperParser.RegexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormatStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatStringLiteral(JasperParser.FormatStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteStringLiteral(JasperParser.ByteStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnicodeStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeStringLiteral(JasperParser.UnicodeStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleStringLiteral(JasperParser.TripleStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RawTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawTripleStringLiteral(JasperParser.RawTripleStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormatTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatTripleStringLiteral(JasperParser.FormatTripleStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(JasperParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(JasperParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(JasperParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralDict(JasperParser.LiteralDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralJson}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralJson(JasperParser.LiteralJsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(JasperParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(JasperParser.DictEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#jsonLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonLiteral(JasperParser.JsonLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#jsonEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonEntry(JasperParser.JsonEntryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonString}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonString(JasperParser.JsonStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonNumber}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonNumber(JasperParser.JsonNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonTrue}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTrue(JasperParser.JsonTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonFalse}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFalse(JasperParser.JsonFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonNull}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonNull(JasperParser.JsonNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonObject}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(JasperParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonArray}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(JasperParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JasperParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JasperParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeExpression}
	 * labeled alternative in {@link JasperParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(JasperParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JasperParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypePrefixAsterisk}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrefixAsterisk(JasperParser.TypePrefixAsteriskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypePrefixAmpersand}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrefixAmpersand(JasperParser.TypePrefixAmpersandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAsteriskSequenceNode}
	 * labeled alternative in {@link JasperParser#typeStarRun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAsteriskSequenceNode(JasperParser.TypeAsteriskSequenceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAmpersandSequenceNode}
	 * labeled alternative in {@link JasperParser#typeAmpRun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAmpersandSequenceNode(JasperParser.TypeAmpersandSequenceNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typeSoftModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSoftModifier(JasperParser.TypeSoftModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNode}
	 * labeled alternative in {@link JasperParser#typeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNode(JasperParser.TypeAtomNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodePrimitive}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodePrimitive(JasperParser.TypeAtomNodePrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeString}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeString(JasperParser.TypeAtomNodeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeBytes}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeBytes(JasperParser.TypeAtomNodeBytesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeRegex}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeRegex(JasperParser.TypeAtomNodeRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeAny}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeAny(JasperParser.TypeAtomNodeAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeUnit}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeUnit(JasperParser.TypeAtomNodeUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeTuple}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeTuple(JasperParser.TypeAtomNodeTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeGroup}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeGroup(JasperParser.TypeAtomNodeGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAtomNodeIdentifier}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtomNodeIdentifier(JasperParser.TypeAtomNodeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeQualNullCoalesceToken}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualNullCoalesceToken(JasperParser.TypeQualNullCoalesceTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeQualNullCoalesceSplit}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualNullCoalesceSplit(JasperParser.TypeQualNullCoalesceSplitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeQualNullable}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualNullable(JasperParser.TypeQualNullableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeQualNonNull}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualNonNull(JasperParser.TypeQualNonNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSuffixDot}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffixDot(JasperParser.TypeSuffixDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSuffixArray}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffixArray(JasperParser.TypeSuffixArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typePostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePostfix(JasperParser.TypePostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JasperParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JasperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArgumentType}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentType(JasperParser.TypeArgumentTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArgumentWildcard}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentWildcard(JasperParser.TypeArgumentWildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JasperParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link JasperParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParam(JasperParser.TypeParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBoundAlternative}
	 * labeled alternative in {@link JasperParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoundAlternative(JasperParser.TypeBoundAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeWildcard}
	 * labeled alternative in {@link JasperParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWildcard(JasperParser.TypeWildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(JasperParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JasperParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationUseNode}
	 * labeled alternative in {@link JasperParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseNode(JasperParser.AnnotationUseNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentsNode}
	 * labeled alternative in {@link JasperParser#annotationArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentsNode(JasperParser.AnnotationArgumentsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentsMixedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentsMixedNode(JasperParser.AnnotationArgumentsMixedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentsNamedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentsNamedNode(JasperParser.AnnotationArgumentsNamedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentSpreadPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentSpreadPositionalNode(JasperParser.AnnotationArgumentSpreadPositionalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentPositionalNode(JasperParser.AnnotationArgumentPositionalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentNamedNode}
	 * labeled alternative in {@link JasperParser#annotationNamedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentNamedNode(JasperParser.AnnotationArgumentNamedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentSpreadNode}
	 * labeled alternative in {@link JasperParser#annotationSpreadArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentSpreadNode(JasperParser.AnnotationArgumentSpreadNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentValueAtNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentValueAtNode(JasperParser.AnnotationArgumentValueAtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationArgumentValueExpressionNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgumentValueExpressionNode(JasperParser.AnnotationArgumentValueExpressionNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JasperParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JasperParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JasperParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(JasperParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(JasperParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JasperParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberField}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberField(JasperParser.MemberFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberProperty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberProperty(JasperParser.MemberPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberConstructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberConstructor(JasperParser.MemberConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDestructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDestructor(JasperParser.MemberDestructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberMethod(JasperParser.MemberMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberClass}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberClass(JasperParser.MemberClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberEnum}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberEnum(JasperParser.MemberEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberInterface}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberInterface(JasperParser.MemberInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAnnotationType}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAnnotationType(JasperParser.MemberAnnotationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberEmpty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberEmpty(JasperParser.MemberEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JasperParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyVariableLike}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyVariableLike(JasperParser.PropertyVariableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyConst}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyConst(JasperParser.PropertyConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#propertyVarHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyVarHeader(JasperParser.PropertyVarHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#propertyConstHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyConstHeader(JasperParser.PropertyConstHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#propertyAccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessor(JasperParser.PropertyAccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#propertyAccessorBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessorBlock(JasperParser.PropertyAccessorBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#accessorBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorBlock(JasperParser.AccessorBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessorGet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorGet(JasperParser.AccessorGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessorSet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorSet(JasperParser.AccessorSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#getterOnlyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterOnlyBlock(JasperParser.GetterOnlyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclarationJavaStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationJavaStyle(JasperParser.MethodDeclarationJavaStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclarationFunctionStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationFunctionStyle(JasperParser.MethodDeclarationFunctionStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodHeaderSimple}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeaderSimple(JasperParser.MethodHeaderSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodHeaderGeneric}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeaderGeneric(JasperParser.MethodHeaderGenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JasperParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodBodyBlock}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBodyBlock(JasperParser.MethodBodyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodBodyEmpty}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBodyEmpty(JasperParser.MethodBodyEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JasperParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#constructorHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorHeader(JasperParser.ConstructorHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(JasperParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JasperParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(JasperParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorDeclaration(JasperParser.DestructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JasperParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(JasperParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JasperParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JasperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(JasperParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(JasperParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JasperParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberConst}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberConst(JasperParser.InterfaceMemberConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberProperty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberProperty(JasperParser.InterfaceMemberPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberMethod(JasperParser.InterfaceMemberMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberAbstractMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberAbstractMethod(JasperParser.InterfaceMemberAbstractMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberClass}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberClass(JasperParser.InterfaceMemberClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberEnum}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberEnum(JasperParser.InterfaceMemberEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberInterface}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberInterface(JasperParser.InterfaceMemberInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberAnnotationType}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberAnnotationType(JasperParser.InterfaceMemberAnnotationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceMemberEmpty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberEmpty(JasperParser.InterfaceMemberEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#interfacePropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePropertyDeclaration(JasperParser.InterfacePropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#interfacePropertyHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePropertyHeader(JasperParser.InterfacePropertyHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JasperParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JasperParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JasperParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JasperParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(JasperParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeOrPrimitivePrimitive}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrPrimitivePrimitive(JasperParser.TypeOrPrimitivePrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeOrPrimitiveType}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrPrimitiveType(JasperParser.TypeOrPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JasperParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(JasperParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JasperParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JasperParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JasperParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastFormalVarargs}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalVarargs(JasperParser.LastFormalVarargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastFormalParam}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParam(JasperParser.LastFormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JasperParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(JasperParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(JasperParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JasperParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JasperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#varDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarator(JasperParser.VarDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JasperParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JasperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableInitializerExpression}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerExpression(JasperParser.VariableInitializerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableInitializerArray}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerArray(JasperParser.VariableInitializerArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#maybeTypedBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeTypedBinding(JasperParser.MaybeTypedBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#typedBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedBinding(JasperParser.TypedBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#catchBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBinding(JasperParser.CatchBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternRoot}
	 * labeled alternative in {@link JasperParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternRoot(JasperParser.PatternRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternOrChain}
	 * labeled alternative in {@link JasperParser#patternOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternOrChain(JasperParser.PatternOrChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternAndChain}
	 * labeled alternative in {@link JasperParser#patternAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAndChain(JasperParser.PatternAndChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternUnaryNot}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternUnaryNot(JasperParser.PatternUnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternUnaryBase}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternUnaryBase(JasperParser.PatternUnaryBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternPrimaryAtom}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternPrimaryAtom(JasperParser.PatternPrimaryAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternPrimaryParen}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternPrimaryParen(JasperParser.PatternPrimaryParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#primaryPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryPattern(JasperParser.PrimaryPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingOrNamePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingOrNamePattern(JasperParser.BindingOrNamePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPattern(JasperParser.BindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingPatternNoType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPatternNoType(JasperParser.BindingPatternNoTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAtom(JasperParser.BindingAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingTuple(JasperParser.BindingTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingNoTypeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingNoTypeAtom(JasperParser.BindingNoTypeAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#bindingNoTypeTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingNoTypeTuple(JasperParser.BindingNoTypeTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInAssignPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInAssignPattern(JasperParser.ForInAssignPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInAssignTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInAssignTuple(JasperParser.ForInAssignTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInAssignAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInAssignAtom(JasperParser.ForInAssignAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(JasperParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JasperParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryMethodReference}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryMethodReference(JasperParser.PrimaryMethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryChain}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryChain(JasperParser.PrimaryChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarySuffixCall}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySuffixCall(JasperParser.PrimarySuffixCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarySuffixDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySuffixDot(JasperParser.PrimarySuffixDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarySuffixIndex}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySuffixIndex(JasperParser.PrimarySuffixIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarySuffixNewAfterDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySuffixNewAfterDot(JasperParser.PrimarySuffixNewAfterDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomLiteral(JasperParser.PrimaryAtomLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomClassLiteral(JasperParser.PrimaryAtomClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomPrimaryClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomPrimaryClassLiteral(JasperParser.PrimaryAtomPrimaryClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomUnitClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomUnitClassLiteral(JasperParser.PrimaryAtomUnitClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomThis(JasperParser.PrimaryAtomThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomTypeThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomTypeThis(JasperParser.PrimaryAtomTypeThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomParen}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomParen(JasperParser.PrimaryAtomParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomNew}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomNew(JasperParser.PrimaryAtomNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomArrayCreation}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomArrayCreation(JasperParser.PrimaryAtomArrayCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomName}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomName(JasperParser.PrimaryAtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomSuper(JasperParser.PrimaryAtomSuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtomTypeSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtomTypeSuper(JasperParser.PrimaryAtomTypeSuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JasperParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixBasePrimary}
	 * labeled alternative in {@link JasperParser#postfixBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixBasePrimary(JasperParser.PostfixBasePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpressionPostIncrement}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionPostIncrement(JasperParser.StatementExpressionPostIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpressionGo}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionGo(JasperParser.StatementExpressionGoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpressionAny}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionAny(JasperParser.StatementExpressionAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReferenceExpressionName}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceExpressionName(JasperParser.MethodReferenceExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReferenceType}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceType(JasperParser.MethodReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReferencePrimaryChain}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferencePrimaryChain(JasperParser.MethodReferencePrimaryChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReferenceSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceSuper(JasperParser.MethodReferenceSuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodReferenceTypeSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReferenceTypeSuper(JasperParser.MethodReferenceTypeSuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorReferenceClass}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorReferenceClass(JasperParser.ConstructorReferenceClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorReferenceArray}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorReferenceArray(JasperParser.ConstructorReferenceArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewUnqualified}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewUnqualified(JasperParser.NewUnqualifiedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewAfterDot}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpressionAfterDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAfterDot(JasperParser.NewAfterDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayNewPrimitiveDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNewPrimitiveDimExprs(JasperParser.ArrayNewPrimitiveDimExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayNewRefDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNewRefDimExprs(JasperParser.ArrayNewRefDimExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitPrimitive}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitPrimitive(JasperParser.ArrayInitPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitRef}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitRef(JasperParser.ArrayInitRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(JasperParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JasperParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(JasperParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLambda(JasperParser.ExprLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(JasperParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JasperParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JasperParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JasperParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExprConditional}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExprConditional(JasperParser.AssignExprConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExprAssignment}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExprAssignment(JasperParser.AssignExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondBinary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBinary(JasperParser.CondBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondTernary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTernary(JasperParser.CondTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryBitAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBitAnd(JasperParser.BinaryBitAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryMultiplication}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMultiplication(JasperParser.BinaryMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryShift}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryShift(JasperParser.BinaryShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAnd(JasperParser.BinaryAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryRelational}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRelational(JasperParser.BinaryRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOr(JasperParser.BinaryOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryEquality}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryEquality(JasperParser.BinaryEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryBitOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBitOr(JasperParser.BinaryBitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryBitExclusiveOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBitExclusiveOr(JasperParser.BinaryBitExclusiveOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAddition}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAddition(JasperParser.BinaryAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryUnary}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryUnary(JasperParser.BinaryUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(JasperParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(JasperParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOther}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOther(JasperParser.UnaryOtherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryCastAs}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryCastAs(JasperParser.UnaryCastAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfix(JasperParser.UnaryPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryBitNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBitNot(JasperParser.UnaryBitNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryLogicalNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalNot(JasperParser.UnaryLogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryAwait}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAwait(JasperParser.UnaryAwaitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryGo}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryGo(JasperParser.UnaryGoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryCast}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryCast(JasperParser.UnaryCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#awaitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(JasperParser.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#goExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoExpression(JasperParser.GoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastPrimitive}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastPrimitive(JasperParser.CastPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExpr}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExpr(JasperParser.CastTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastAs}
	 * labeled alternative in {@link JasperParser#castAsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastAs(JasperParser.CastAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExprNode}
	 * labeled alternative in {@link JasperParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExprNode(JasperParser.CastTypeExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExprOrNode}
	 * labeled alternative in {@link JasperParser#castTypeOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExprOrNode(JasperParser.CastTypeExprOrNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExprAndNode}
	 * labeled alternative in {@link JasperParser#castTypeAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExprAndNode(JasperParser.CastTypeExprAndNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExprGroup}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExprGroup(JasperParser.CastTypeExprGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastTypeExprBase}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypeExprBase(JasperParser.CastTypeExprBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JasperParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftHandSideExpressionName}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideExpressionName(JasperParser.LeftHandSideExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftHandSidePrimary}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSidePrimary(JasperParser.LeftHandSidePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#lhsPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsPrimary(JasperParser.LhsPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftHandSideField}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideField(JasperParser.LeftHandSideFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftHandSideIndex}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideIndex(JasperParser.LeftHandSideIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JasperParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JasperParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatementLocalVariable}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementLocalVariable(JasperParser.BlockStatementLocalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatementClassDeclaration}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementClassDeclaration(JasperParser.BlockStatementClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatementStatement}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementStatement(JasperParser.BlockStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(JasperParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementEmpty(JasperParser.StatementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpressionStatement}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionStatement(JasperParser.StatementExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementGo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementGo(JasperParser.StatementGoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementYield}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementYield(JasperParser.StatementYieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementAssert}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssert(JasperParser.StatementAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(JasperParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(JasperParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(JasperParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(JasperParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(JasperParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementLock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLock(JasperParser.StatementLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementThrow}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThrow(JasperParser.StatementThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementTry}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTry(JasperParser.StatementTryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementLabeled}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLabeled(JasperParser.StatementLabeledContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(JasperParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(JasperParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(JasperParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDefer}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefer(JasperParser.StatementDeferContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#deferStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStatement(JasperParser.DeferStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#loopThenElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopThenElse(JasperParser.LoopThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(JasperParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(JasperParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JasperParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#goStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoStatement(JasperParser.GoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(JasperParser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JasperParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(JasperParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertSimple}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertSimple(JasperParser.AssertSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertWithMessage}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertWithMessage(JasperParser.AssertWithMessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JasperParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JasperParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCaseWhen}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseWhen(JasperParser.SwitchCaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCaseDefault}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseDefault(JasperParser.SwitchCaseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#switchGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchGuard(JasperParser.SwitchGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JasperParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(JasperParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JasperParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForClassicInitDecl}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClassicInitDecl(JasperParser.ForClassicInitDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForClassicInitExprs}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClassicInitExprs(JasperParser.ForClassicInitExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForClassicUpdateExprs}
	 * labeled alternative in {@link JasperParser#forClassicUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClassicUpdateExprs(JasperParser.ForClassicUpdateExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forClassicControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClassicControl(JasperParser.ForClassicControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JasperParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JasperParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JasperParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JasperParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#lockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStatement(JasperParser.LockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatches}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatches(JasperParser.TryCatchesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryFinally(JasperParser.TryFinallyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryWithResources}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResources(JasperParser.TryWithResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JasperParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(JasperParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResourceTypedVarId}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceTypedVarId(JasperParser.ResourceTypedVarIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResourceTypedBinding}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceTypedBinding(JasperParser.ResourceTypedBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResourceVarLike}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceVarLike(JasperParser.ResourceVarLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoTargetPrimary}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoTargetPrimary(JasperParser.GoTargetPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoTargetLambda}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoTargetLambda(JasperParser.GoTargetLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoTargetBlock}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoTargetBlock(JasperParser.GoTargetBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoTargetParen}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoTargetParen(JasperParser.GoTargetParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JasperParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInControl(JasperParser.ForInControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInBinding(JasperParser.ForInBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#forInDeclBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInDeclBinding(JasperParser.ForInDeclBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link JasperParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JasperParser.CatchTypeContext ctx);
}