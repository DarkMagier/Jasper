// Generated from /Users/auth/IdeaProjects/Jasper/src/main/antlr/grammar/JasperParser.g4 by ANTLR 4.13.2
package gen.antlr.jasper;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JasperParser}.
 */
public interface JasperParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JasperParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(JasperParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(JasperParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JasperParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JasperParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportSingle(JasperParser.ImportSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportSingle(JasperParser.ImportSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportOnDemand(JasperParser.ImportOnDemandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportOnDemand(JasperParser.ImportOnDemandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStaticSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportStaticSingle(JasperParser.ImportStaticSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStaticSingle}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportStaticSingle(JasperParser.ImportStaticSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStaticOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportStaticOnDemand(JasperParser.ImportStaticOnDemandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStaticOnDemand}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportStaticOnDemand(JasperParser.ImportStaticOnDemandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(JasperParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFrom}
	 * labeled alternative in {@link JasperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(JasperParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportQualified}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFromImportQualified(JasperParser.FromImportQualifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportQualified}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFromImportQualified(JasperParser.FromImportQualifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFromImportString(JasperParser.FromImportStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFromImportString(JasperParser.FromImportStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportRawString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFromImportRawString(JasperParser.FromImportRawStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportRawString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFromImportRawString(JasperParser.FromImportRawStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFromImportTripleString(JasperParser.FromImportTripleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFromImportTripleString(JasperParser.FromImportTripleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportRawTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFromImportRawTripleString(JasperParser.FromImportRawTripleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportRawTripleString}
	 * labeled alternative in {@link JasperParser#fromImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFromImportRawTripleString(JasperParser.FromImportRawTripleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportClauseAll}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClauseAll(JasperParser.ImportClauseAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportClauseAll}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClauseAll(JasperParser.ImportClauseAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportClauseItems}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClauseItems(JasperParser.ImportClauseItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportClauseItems}
	 * labeled alternative in {@link JasperParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClauseItems(JasperParser.ImportClauseItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(JasperParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(JasperParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopLevelDeclarationItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclarationItem(JasperParser.TopLevelDeclarationItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelDeclarationItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclarationItem(JasperParser.TopLevelDeclarationItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopLevelStatementItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStatementItem(JasperParser.TopLevelStatementItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelStatementItem}
	 * labeled alternative in {@link JasperParser#topLevelItem}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStatementItem(JasperParser.TopLevelStatementItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopDeclarationClass}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationClass(JasperParser.TopDeclarationClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopDeclarationClass}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationClass(JasperParser.TopDeclarationClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopDeclarationInterface}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationInterface(JasperParser.TopDeclarationInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopDeclarationInterface}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationInterface(JasperParser.TopDeclarationInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopDeclarationFunction}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationFunction(JasperParser.TopDeclarationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopDeclarationFunction}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationFunction(JasperParser.TopDeclarationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopDeclarationEmptyDeclaration}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationEmptyDeclaration(JasperParser.TopDeclarationEmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopDeclarationEmptyDeclaration}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationEmptyDeclaration(JasperParser.TopDeclarationEmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopDeclarationVariable}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationVariable(JasperParser.TopDeclarationVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopDeclarationVariable}
	 * labeled alternative in {@link JasperParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationVariable(JasperParser.TopDeclarationVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelVariableDeclaration(JasperParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#topLevelVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelVariableDeclaration(JasperParser.TopLevelVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSoftKeyword(JasperParser.SoftKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSoftKeyword(JasperParser.SoftKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softWhen}.
	 * @param ctx the parse tree
	 */
	void enterSoftWhen(JasperParser.SoftWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softWhen}.
	 * @param ctx the parse tree
	 */
	void exitSoftWhen(JasperParser.SoftWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softThen}.
	 * @param ctx the parse tree
	 */
	void enterSoftThen(JasperParser.SoftThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softThen}.
	 * @param ctx the parse tree
	 */
	void exitSoftThen(JasperParser.SoftThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softLabel}.
	 * @param ctx the parse tree
	 */
	void enterSoftLabel(JasperParser.SoftLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softLabel}.
	 * @param ctx the parse tree
	 */
	void exitSoftLabel(JasperParser.SoftLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softDecorate}.
	 * @param ctx the parse tree
	 */
	void enterSoftDecorate(JasperParser.SoftDecorateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softDecorate}.
	 * @param ctx the parse tree
	 */
	void exitSoftDecorate(JasperParser.SoftDecorateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softFrom}.
	 * @param ctx the parse tree
	 */
	void enterSoftFrom(JasperParser.SoftFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softFrom}.
	 * @param ctx the parse tree
	 */
	void exitSoftFrom(JasperParser.SoftFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softAs}.
	 * @param ctx the parse tree
	 */
	void enterSoftAs(JasperParser.SoftAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softAs}.
	 * @param ctx the parse tree
	 */
	void exitSoftAs(JasperParser.SoftAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softCast}.
	 * @param ctx the parse tree
	 */
	void enterSoftCast(JasperParser.SoftCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softCast}.
	 * @param ctx the parse tree
	 */
	void exitSoftCast(JasperParser.SoftCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softJson}.
	 * @param ctx the parse tree
	 */
	void enterSoftJson(JasperParser.SoftJsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softJson}.
	 * @param ctx the parse tree
	 */
	void exitSoftJson(JasperParser.SoftJsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softGet}.
	 * @param ctx the parse tree
	 */
	void enterSoftGet(JasperParser.SoftGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softGet}.
	 * @param ctx the parse tree
	 */
	void exitSoftGet(JasperParser.SoftGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softSet}.
	 * @param ctx the parse tree
	 */
	void enterSoftSet(JasperParser.SoftSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softSet}.
	 * @param ctx the parse tree
	 */
	void exitSoftSet(JasperParser.SoftSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softOr}.
	 * @param ctx the parse tree
	 */
	void enterSoftOr(JasperParser.SoftOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softOr}.
	 * @param ctx the parse tree
	 */
	void exitSoftOr(JasperParser.SoftOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softAnd}.
	 * @param ctx the parse tree
	 */
	void enterSoftAnd(JasperParser.SoftAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softAnd}.
	 * @param ctx the parse tree
	 */
	void exitSoftAnd(JasperParser.SoftAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#softNot}.
	 * @param ctx the parse tree
	 */
	void enterSoftNot(JasperParser.SoftNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#softNot}.
	 * @param ctx the parse tree
	 */
	void exitSoftNot(JasperParser.SoftNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JasperParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JasperParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(JasperParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(JasperParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(JasperParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexadecimalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(JasperParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OctalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(JasperParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OctalLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(JasperParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(JasperParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(JasperParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(JasperParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(JasperParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RawStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterRawStringLiteral(JasperParser.RawStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RawStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitRawStringLiteral(JasperParser.RawStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegexLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterRegexLiteral(JasperParser.RegexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegexLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitRegexLiteral(JasperParser.RegexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFormatStringLiteral(JasperParser.FormatStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFormatStringLiteral(JasperParser.FormatStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterByteStringLiteral(JasperParser.ByteStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitByteStringLiteral(JasperParser.ByteStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnicodeStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeStringLiteral(JasperParser.UnicodeStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnicodeStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeStringLiteral(JasperParser.UnicodeStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTripleStringLiteral(JasperParser.TripleStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTripleStringLiteral(JasperParser.TripleStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RawTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterRawTripleStringLiteral(JasperParser.RawTripleStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RawTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitRawTripleStringLiteral(JasperParser.RawTripleStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFormatTripleStringLiteral(JasperParser.FormatTripleStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatTripleStringLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFormatTripleStringLiteral(JasperParser.FormatTripleStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(JasperParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(JasperParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(JasperParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(JasperParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(JasperParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(JasperParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralDict(JasperParser.LiteralDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralDict(JasperParser.LiteralDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralJson}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralJson(JasperParser.LiteralJsonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralJson}
	 * labeled alternative in {@link JasperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralJson(JasperParser.LiteralJsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(JasperParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(JasperParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(JasperParser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(JasperParser.DictEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#jsonLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJsonLiteral(JasperParser.JsonLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#jsonLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJsonLiteral(JasperParser.JsonLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#jsonEntry}.
	 * @param ctx the parse tree
	 */
	void enterJsonEntry(JasperParser.JsonEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#jsonEntry}.
	 * @param ctx the parse tree
	 */
	void exitJsonEntry(JasperParser.JsonEntryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonString}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonString(JasperParser.JsonStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonString}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonString(JasperParser.JsonStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonNumber}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonNumber(JasperParser.JsonNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonNumber}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonNumber(JasperParser.JsonNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonTrue}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonTrue(JasperParser.JsonTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonTrue}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonTrue(JasperParser.JsonTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonFalse}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonFalse(JasperParser.JsonFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonFalse}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonFalse(JasperParser.JsonFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonNull}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonNull(JasperParser.JsonNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonNull}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonNull(JasperParser.JsonNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonObject}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(JasperParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonObject}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(JasperParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsonArray}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(JasperParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsonArray}
	 * labeled alternative in {@link JasperParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(JasperParser.JsonArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JasperParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JasperParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JasperParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JasperParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeExpression}
	 * labeled alternative in {@link JasperParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(JasperParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeExpression}
	 * labeled alternative in {@link JasperParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(JasperParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JasperParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JasperParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypePrefixAsterisk}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypePrefixAsterisk(JasperParser.TypePrefixAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypePrefixAsterisk}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypePrefixAsterisk(JasperParser.TypePrefixAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypePrefixAmpersand}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypePrefixAmpersand(JasperParser.TypePrefixAmpersandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypePrefixAmpersand}
	 * labeled alternative in {@link JasperParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypePrefixAmpersand(JasperParser.TypePrefixAmpersandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAsteriskSequenceNode}
	 * labeled alternative in {@link JasperParser#typeStarRun}.
	 * @param ctx the parse tree
	 */
	void enterTypeAsteriskSequenceNode(JasperParser.TypeAsteriskSequenceNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAsteriskSequenceNode}
	 * labeled alternative in {@link JasperParser#typeStarRun}.
	 * @param ctx the parse tree
	 */
	void exitTypeAsteriskSequenceNode(JasperParser.TypeAsteriskSequenceNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAmpersandSequenceNode}
	 * labeled alternative in {@link JasperParser#typeAmpRun}.
	 * @param ctx the parse tree
	 */
	void enterTypeAmpersandSequenceNode(JasperParser.TypeAmpersandSequenceNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAmpersandSequenceNode}
	 * labeled alternative in {@link JasperParser#typeAmpRun}.
	 * @param ctx the parse tree
	 */
	void exitTypeAmpersandSequenceNode(JasperParser.TypeAmpersandSequenceNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typeSoftModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSoftModifier(JasperParser.TypeSoftModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typeSoftModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSoftModifier(JasperParser.TypeSoftModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNode}
	 * labeled alternative in {@link JasperParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNode(JasperParser.TypeAtomNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNode}
	 * labeled alternative in {@link JasperParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNode(JasperParser.TypeAtomNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodePrimitive}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodePrimitive(JasperParser.TypeAtomNodePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodePrimitive}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodePrimitive(JasperParser.TypeAtomNodePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeString}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeString(JasperParser.TypeAtomNodeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeString}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeString(JasperParser.TypeAtomNodeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeBytes}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeBytes(JasperParser.TypeAtomNodeBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeBytes}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeBytes(JasperParser.TypeAtomNodeBytesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeRegex}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeRegex(JasperParser.TypeAtomNodeRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeRegex}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeRegex(JasperParser.TypeAtomNodeRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeAny}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeAny(JasperParser.TypeAtomNodeAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeAny}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeAny(JasperParser.TypeAtomNodeAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeUnit}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeUnit(JasperParser.TypeAtomNodeUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeUnit}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeUnit(JasperParser.TypeAtomNodeUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeTuple}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeTuple(JasperParser.TypeAtomNodeTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeTuple}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeTuple(JasperParser.TypeAtomNodeTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeGroup}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeGroup(JasperParser.TypeAtomNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeGroup}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeGroup(JasperParser.TypeAtomNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAtomNodeIdentifier}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomNodeIdentifier(JasperParser.TypeAtomNodeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAtomNodeIdentifier}
	 * labeled alternative in {@link JasperParser#typeAtomBase}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomNodeIdentifier(JasperParser.TypeAtomNodeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeQualNullCoalesceToken}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualNullCoalesceToken(JasperParser.TypeQualNullCoalesceTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeQualNullCoalesceToken}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualNullCoalesceToken(JasperParser.TypeQualNullCoalesceTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeQualNullCoalesceSplit}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualNullCoalesceSplit(JasperParser.TypeQualNullCoalesceSplitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeQualNullCoalesceSplit}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualNullCoalesceSplit(JasperParser.TypeQualNullCoalesceSplitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeQualNullable}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualNullable(JasperParser.TypeQualNullableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeQualNullable}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualNullable(JasperParser.TypeQualNullableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeQualNonNull}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualNonNull(JasperParser.TypeQualNonNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeQualNonNull}
	 * labeled alternative in {@link JasperParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualNonNull(JasperParser.TypeQualNonNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSuffixDot}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixDot(JasperParser.TypeSuffixDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSuffixDot}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixDot(JasperParser.TypeSuffixDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSuffixArray}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixArray(JasperParser.TypeSuffixArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSuffixArray}
	 * labeled alternative in {@link JasperParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixArray(JasperParser.TypeSuffixArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typePostfix}.
	 * @param ctx the parse tree
	 */
	void enterTypePostfix(JasperParser.TypePostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typePostfix}.
	 * @param ctx the parse tree
	 */
	void exitTypePostfix(JasperParser.TypePostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JasperParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JasperParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JasperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JasperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeArgumentType}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentType(JasperParser.TypeArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeArgumentType}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentType(JasperParser.TypeArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeArgumentWildcard}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentWildcard(JasperParser.TypeArgumentWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeArgumentWildcard}
	 * labeled alternative in {@link JasperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentWildcard(JasperParser.TypeArgumentWildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JasperParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JasperParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link JasperParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(JasperParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeParam}
	 * labeled alternative in {@link JasperParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(JasperParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBoundAlternative}
	 * labeled alternative in {@link JasperParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoundAlternative(JasperParser.TypeBoundAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBoundAlternative}
	 * labeled alternative in {@link JasperParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoundAlternative(JasperParser.TypeBoundAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeWildcard}
	 * labeled alternative in {@link JasperParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterTypeWildcard(JasperParser.TypeWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeWildcard}
	 * labeled alternative in {@link JasperParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitTypeWildcard(JasperParser.TypeWildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JasperParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JasperParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JasperParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JasperParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationUseNode}
	 * labeled alternative in {@link JasperParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseNode(JasperParser.AnnotationUseNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationUseNode}
	 * labeled alternative in {@link JasperParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseNode(JasperParser.AnnotationUseNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentsNode}
	 * labeled alternative in {@link JasperParser#annotationArguments}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentsNode(JasperParser.AnnotationArgumentsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentsNode}
	 * labeled alternative in {@link JasperParser#annotationArguments}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentsNode(JasperParser.AnnotationArgumentsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentsMixedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentsMixedNode(JasperParser.AnnotationArgumentsMixedNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentsMixedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentsMixedNode(JasperParser.AnnotationArgumentsMixedNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentsNamedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentsNamedNode(JasperParser.AnnotationArgumentsNamedNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentsNamedNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentsNamedNode(JasperParser.AnnotationArgumentsNamedNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentSpreadPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentSpreadPositionalNode(JasperParser.AnnotationArgumentSpreadPositionalNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentSpreadPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentSpreadPositionalNode(JasperParser.AnnotationArgumentSpreadPositionalNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentPositionalNode(JasperParser.AnnotationArgumentPositionalNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentPositionalNode}
	 * labeled alternative in {@link JasperParser#annotationPositionalArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentPositionalNode(JasperParser.AnnotationArgumentPositionalNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentNamedNode}
	 * labeled alternative in {@link JasperParser#annotationNamedArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentNamedNode(JasperParser.AnnotationArgumentNamedNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentNamedNode}
	 * labeled alternative in {@link JasperParser#annotationNamedArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentNamedNode(JasperParser.AnnotationArgumentNamedNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentSpreadNode}
	 * labeled alternative in {@link JasperParser#annotationSpreadArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentSpreadNode(JasperParser.AnnotationArgumentSpreadNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentSpreadNode}
	 * labeled alternative in {@link JasperParser#annotationSpreadArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentSpreadNode(JasperParser.AnnotationArgumentSpreadNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentValueAtNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentValueAtNode(JasperParser.AnnotationArgumentValueAtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentValueAtNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentValueAtNode(JasperParser.AnnotationArgumentValueAtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgumentValueExpressionNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgumentValueExpressionNode(JasperParser.AnnotationArgumentValueExpressionNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgumentValueExpressionNode}
	 * labeled alternative in {@link JasperParser#annotationArgumentValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgumentValueExpressionNode(JasperParser.AnnotationArgumentValueExpressionNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JasperParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JasperParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JasperParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JasperParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JasperParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JasperParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JasperParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JasperParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JasperParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JasperParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JasperParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JasperParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberField}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberField(JasperParser.MemberFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberField}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberField(JasperParser.MemberFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberProperty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberProperty(JasperParser.MemberPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberProperty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberProperty(JasperParser.MemberPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberConstructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberConstructor(JasperParser.MemberConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberConstructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberConstructor(JasperParser.MemberConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDestructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDestructor(JasperParser.MemberDestructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDestructor}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDestructor(JasperParser.MemberDestructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberMethod(JasperParser.MemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberMethod}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberMethod(JasperParser.MemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberClass}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberClass(JasperParser.MemberClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberClass}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberClass(JasperParser.MemberClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberEnum}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberEnum(JasperParser.MemberEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberEnum}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberEnum(JasperParser.MemberEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberInterface}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberInterface(JasperParser.MemberInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberInterface}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberInterface(JasperParser.MemberInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAnnotationType}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberAnnotationType(JasperParser.MemberAnnotationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAnnotationType}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberAnnotationType(JasperParser.MemberAnnotationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberEmpty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberEmpty(JasperParser.MemberEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberEmpty}
	 * labeled alternative in {@link JasperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberEmpty(JasperParser.MemberEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JasperParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JasperParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyVariableLike}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyVariableLike(JasperParser.PropertyVariableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyVariableLike}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyVariableLike(JasperParser.PropertyVariableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyConst}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyConst(JasperParser.PropertyConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyConst}
	 * labeled alternative in {@link JasperParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyConst(JasperParser.PropertyConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#propertyVarHeader}.
	 * @param ctx the parse tree
	 */
	void enterPropertyVarHeader(JasperParser.PropertyVarHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#propertyVarHeader}.
	 * @param ctx the parse tree
	 */
	void exitPropertyVarHeader(JasperParser.PropertyVarHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#propertyConstHeader}.
	 * @param ctx the parse tree
	 */
	void enterPropertyConstHeader(JasperParser.PropertyConstHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#propertyConstHeader}.
	 * @param ctx the parse tree
	 */
	void exitPropertyConstHeader(JasperParser.PropertyConstHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#propertyAccessor}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessor(JasperParser.PropertyAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#propertyAccessor}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessor(JasperParser.PropertyAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#propertyAccessorBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessorBlock(JasperParser.PropertyAccessorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#propertyAccessorBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessorBlock(JasperParser.PropertyAccessorBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#accessorBlock}.
	 * @param ctx the parse tree
	 */
	void enterAccessorBlock(JasperParser.AccessorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#accessorBlock}.
	 * @param ctx the parse tree
	 */
	void exitAccessorBlock(JasperParser.AccessorBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessorGet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 */
	void enterAccessorGet(JasperParser.AccessorGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessorGet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 */
	void exitAccessorGet(JasperParser.AccessorGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessorSet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 */
	void enterAccessorSet(JasperParser.AccessorSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessorSet}
	 * labeled alternative in {@link JasperParser#accessorItem}.
	 * @param ctx the parse tree
	 */
	void exitAccessorSet(JasperParser.AccessorSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#getterOnlyBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterOnlyBlock(JasperParser.GetterOnlyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#getterOnlyBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterOnlyBlock(JasperParser.GetterOnlyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationJavaStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationJavaStyle(JasperParser.MethodDeclarationJavaStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationJavaStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationJavaStyle(JasperParser.MethodDeclarationJavaStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationFunctionStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationFunctionStyle(JasperParser.MethodDeclarationFunctionStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationFunctionStyle}
	 * labeled alternative in {@link JasperParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationFunctionStyle(JasperParser.MethodDeclarationFunctionStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodHeaderSimple}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeaderSimple(JasperParser.MethodHeaderSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodHeaderSimple}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeaderSimple(JasperParser.MethodHeaderSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodHeaderGeneric}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeaderGeneric(JasperParser.MethodHeaderGenericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodHeaderGeneric}
	 * labeled alternative in {@link JasperParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeaderGeneric(JasperParser.MethodHeaderGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JasperParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JasperParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodBodyBlock}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyBlock(JasperParser.MethodBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodBodyBlock}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyBlock(JasperParser.MethodBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodBodyEmpty}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyEmpty(JasperParser.MethodBodyEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodBodyEmpty}
	 * labeled alternative in {@link JasperParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyEmpty(JasperParser.MethodBodyEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JasperParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JasperParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#constructorHeader}.
	 * @param ctx the parse tree
	 */
	void enterConstructorHeader(JasperParser.ConstructorHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#constructorHeader}.
	 * @param ctx the parse tree
	 */
	void exitConstructorHeader(JasperParser.ConstructorHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JasperParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JasperParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JasperParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JasperParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JasperParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JasperParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDeclaration(JasperParser.DestructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDeclaration(JasperParser.DestructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JasperParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JasperParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JasperParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JasperParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JasperParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JasperParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JasperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JasperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JasperParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JasperParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JasperParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JasperParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JasperParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JasperParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberConst}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberConst(JasperParser.InterfaceMemberConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberConst}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberConst(JasperParser.InterfaceMemberConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberProperty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberProperty(JasperParser.InterfaceMemberPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberProperty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberProperty(JasperParser.InterfaceMemberPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberMethod(JasperParser.InterfaceMemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberMethod(JasperParser.InterfaceMemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberAbstractMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberAbstractMethod(JasperParser.InterfaceMemberAbstractMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberAbstractMethod}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberAbstractMethod(JasperParser.InterfaceMemberAbstractMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberClass}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberClass(JasperParser.InterfaceMemberClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberClass}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberClass(JasperParser.InterfaceMemberClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberEnum}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberEnum(JasperParser.InterfaceMemberEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberEnum}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberEnum(JasperParser.InterfaceMemberEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberInterface}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberInterface(JasperParser.InterfaceMemberInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberInterface}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberInterface(JasperParser.InterfaceMemberInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberAnnotationType}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberAnnotationType(JasperParser.InterfaceMemberAnnotationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberAnnotationType}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberAnnotationType(JasperParser.InterfaceMemberAnnotationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceMemberEmpty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberEmpty(JasperParser.InterfaceMemberEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceMemberEmpty}
	 * labeled alternative in {@link JasperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberEmpty(JasperParser.InterfaceMemberEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#interfacePropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePropertyDeclaration(JasperParser.InterfacePropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#interfacePropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePropertyDeclaration(JasperParser.InterfacePropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#interfacePropertyHeader}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePropertyHeader(JasperParser.InterfacePropertyHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#interfacePropertyHeader}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePropertyHeader(JasperParser.InterfacePropertyHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JasperParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JasperParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JasperParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JasperParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JasperParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JasperParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JasperParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JasperParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JasperParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JasperParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeOrPrimitivePrimitive}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrPrimitivePrimitive(JasperParser.TypeOrPrimitivePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeOrPrimitivePrimitive}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrPrimitivePrimitive(JasperParser.TypeOrPrimitivePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeOrPrimitiveType}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrPrimitiveType(JasperParser.TypeOrPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeOrPrimitiveType}
	 * labeled alternative in {@link JasperParser#typeOrPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrPrimitiveType(JasperParser.TypeOrPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JasperParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JasperParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(JasperParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(JasperParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JasperParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JasperParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JasperParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JasperParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JasperParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JasperParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastFormalVarargs}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalVarargs(JasperParser.LastFormalVarargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastFormalVarargs}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalVarargs(JasperParser.LastFormalVarargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastFormalParam}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParam(JasperParser.LastFormalParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastFormalParam}
	 * labeled alternative in {@link JasperParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParam(JasperParser.LastFormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JasperParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JasperParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JasperParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JasperParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JasperParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JasperParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JasperParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JasperParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JasperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JasperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#varDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarator(JasperParser.VarDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#varDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarator(JasperParser.VarDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JasperParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JasperParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JasperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JasperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInitializerExpression}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerExpression(JasperParser.VariableInitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInitializerExpression}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerExpression(JasperParser.VariableInitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInitializerArray}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerArray(JasperParser.VariableInitializerArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInitializerArray}
	 * labeled alternative in {@link JasperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerArray(JasperParser.VariableInitializerArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#maybeTypedBinding}.
	 * @param ctx the parse tree
	 */
	void enterMaybeTypedBinding(JasperParser.MaybeTypedBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#maybeTypedBinding}.
	 * @param ctx the parse tree
	 */
	void exitMaybeTypedBinding(JasperParser.MaybeTypedBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#typedBinding}.
	 * @param ctx the parse tree
	 */
	void enterTypedBinding(JasperParser.TypedBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#typedBinding}.
	 * @param ctx the parse tree
	 */
	void exitTypedBinding(JasperParser.TypedBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#catchBinding}.
	 * @param ctx the parse tree
	 */
	void enterCatchBinding(JasperParser.CatchBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#catchBinding}.
	 * @param ctx the parse tree
	 */
	void exitCatchBinding(JasperParser.CatchBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternRoot}
	 * labeled alternative in {@link JasperParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternRoot(JasperParser.PatternRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternRoot}
	 * labeled alternative in {@link JasperParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternRoot(JasperParser.PatternRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternOrChain}
	 * labeled alternative in {@link JasperParser#patternOr}.
	 * @param ctx the parse tree
	 */
	void enterPatternOrChain(JasperParser.PatternOrChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternOrChain}
	 * labeled alternative in {@link JasperParser#patternOr}.
	 * @param ctx the parse tree
	 */
	void exitPatternOrChain(JasperParser.PatternOrChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternAndChain}
	 * labeled alternative in {@link JasperParser#patternAnd}.
	 * @param ctx the parse tree
	 */
	void enterPatternAndChain(JasperParser.PatternAndChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternAndChain}
	 * labeled alternative in {@link JasperParser#patternAnd}.
	 * @param ctx the parse tree
	 */
	void exitPatternAndChain(JasperParser.PatternAndChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternUnaryNot}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 */
	void enterPatternUnaryNot(JasperParser.PatternUnaryNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternUnaryNot}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 */
	void exitPatternUnaryNot(JasperParser.PatternUnaryNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternUnaryBase}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 */
	void enterPatternUnaryBase(JasperParser.PatternUnaryBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternUnaryBase}
	 * labeled alternative in {@link JasperParser#patternUnary}.
	 * @param ctx the parse tree
	 */
	void exitPatternUnaryBase(JasperParser.PatternUnaryBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternPrimaryAtom}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPatternPrimaryAtom(JasperParser.PatternPrimaryAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternPrimaryAtom}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPatternPrimaryAtom(JasperParser.PatternPrimaryAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternPrimaryParen}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPatternPrimaryParen(JasperParser.PatternPrimaryParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternPrimaryParen}
	 * labeled alternative in {@link JasperParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPatternPrimaryParen(JasperParser.PatternPrimaryParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#primaryPattern}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryPattern(JasperParser.PrimaryPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#primaryPattern}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryPattern(JasperParser.PrimaryPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingOrNamePattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingOrNamePattern(JasperParser.BindingOrNamePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingOrNamePattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingOrNamePattern(JasperParser.BindingOrNamePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingPattern(JasperParser.BindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingPattern(JasperParser.BindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingPatternNoType}.
	 * @param ctx the parse tree
	 */
	void enterBindingPatternNoType(JasperParser.BindingPatternNoTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingPatternNoType}.
	 * @param ctx the parse tree
	 */
	void exitBindingPatternNoType(JasperParser.BindingPatternNoTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingAtom}.
	 * @param ctx the parse tree
	 */
	void enterBindingAtom(JasperParser.BindingAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingAtom}.
	 * @param ctx the parse tree
	 */
	void exitBindingAtom(JasperParser.BindingAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingTuple}.
	 * @param ctx the parse tree
	 */
	void enterBindingTuple(JasperParser.BindingTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingTuple}.
	 * @param ctx the parse tree
	 */
	void exitBindingTuple(JasperParser.BindingTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingNoTypeAtom}.
	 * @param ctx the parse tree
	 */
	void enterBindingNoTypeAtom(JasperParser.BindingNoTypeAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingNoTypeAtom}.
	 * @param ctx the parse tree
	 */
	void exitBindingNoTypeAtom(JasperParser.BindingNoTypeAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#bindingNoTypeTuple}.
	 * @param ctx the parse tree
	 */
	void enterBindingNoTypeTuple(JasperParser.BindingNoTypeTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#bindingNoTypeTuple}.
	 * @param ctx the parse tree
	 */
	void exitBindingNoTypeTuple(JasperParser.BindingNoTypeTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInAssignPattern}.
	 * @param ctx the parse tree
	 */
	void enterForInAssignPattern(JasperParser.ForInAssignPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInAssignPattern}.
	 * @param ctx the parse tree
	 */
	void exitForInAssignPattern(JasperParser.ForInAssignPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInAssignTuple}.
	 * @param ctx the parse tree
	 */
	void enterForInAssignTuple(JasperParser.ForInAssignTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInAssignTuple}.
	 * @param ctx the parse tree
	 */
	void exitForInAssignTuple(JasperParser.ForInAssignTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInAssignAtom}.
	 * @param ctx the parse tree
	 */
	void enterForInAssignAtom(JasperParser.ForInAssignAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInAssignAtom}.
	 * @param ctx the parse tree
	 */
	void exitForInAssignAtom(JasperParser.ForInAssignAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(JasperParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(JasperParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JasperParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JasperParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryMethodReference}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryMethodReference(JasperParser.PrimaryMethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryMethodReference}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryMethodReference(JasperParser.PrimaryMethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryChain}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryChain(JasperParser.PrimaryChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryChain}
	 * labeled alternative in {@link JasperParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryChain(JasperParser.PrimaryChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimarySuffixCall}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffixCall(JasperParser.PrimarySuffixCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimarySuffixCall}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffixCall(JasperParser.PrimarySuffixCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimarySuffixDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffixDot(JasperParser.PrimarySuffixDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimarySuffixDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffixDot(JasperParser.PrimarySuffixDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimarySuffixIndex}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffixIndex(JasperParser.PrimarySuffixIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimarySuffixIndex}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffixIndex(JasperParser.PrimarySuffixIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimarySuffixNewAfterDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffixNewAfterDot(JasperParser.PrimarySuffixNewAfterDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimarySuffixNewAfterDot}
	 * labeled alternative in {@link JasperParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffixNewAfterDot(JasperParser.PrimarySuffixNewAfterDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomLiteral(JasperParser.PrimaryAtomLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomLiteral(JasperParser.PrimaryAtomLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomClassLiteral(JasperParser.PrimaryAtomClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomClassLiteral(JasperParser.PrimaryAtomClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomPrimaryClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomPrimaryClassLiteral(JasperParser.PrimaryAtomPrimaryClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomPrimaryClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomPrimaryClassLiteral(JasperParser.PrimaryAtomPrimaryClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomUnitClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomUnitClassLiteral(JasperParser.PrimaryAtomUnitClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomUnitClassLiteral}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomUnitClassLiteral(JasperParser.PrimaryAtomUnitClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomThis(JasperParser.PrimaryAtomThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomThis(JasperParser.PrimaryAtomThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomTypeThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomTypeThis(JasperParser.PrimaryAtomTypeThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomTypeThis}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomTypeThis(JasperParser.PrimaryAtomTypeThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomParen}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomParen(JasperParser.PrimaryAtomParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomParen}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomParen(JasperParser.PrimaryAtomParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomNew}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomNew(JasperParser.PrimaryAtomNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomNew}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomNew(JasperParser.PrimaryAtomNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomArrayCreation}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomArrayCreation(JasperParser.PrimaryAtomArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomArrayCreation}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomArrayCreation(JasperParser.PrimaryAtomArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomName}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomName(JasperParser.PrimaryAtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomName}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomName(JasperParser.PrimaryAtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomSuper(JasperParser.PrimaryAtomSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomSuper(JasperParser.PrimaryAtomSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtomTypeSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtomTypeSuper(JasperParser.PrimaryAtomTypeSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtomTypeSuper}
	 * labeled alternative in {@link JasperParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtomTypeSuper(JasperParser.PrimaryAtomTypeSuperContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JasperParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JasperParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixBasePrimary}
	 * labeled alternative in {@link JasperParser#postfixBase}.
	 * @param ctx the parse tree
	 */
	void enterPostfixBasePrimary(JasperParser.PostfixBasePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixBasePrimary}
	 * labeled alternative in {@link JasperParser#postfixBase}.
	 * @param ctx the parse tree
	 */
	void exitPostfixBasePrimary(JasperParser.PostfixBasePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressionPostIncrement}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionPostIncrement(JasperParser.StatementExpressionPostIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressionPostIncrement}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionPostIncrement(JasperParser.StatementExpressionPostIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressionGo}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionGo(JasperParser.StatementExpressionGoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressionGo}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionGo(JasperParser.StatementExpressionGoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressionAny}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionAny(JasperParser.StatementExpressionAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressionAny}
	 * labeled alternative in {@link JasperParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionAny(JasperParser.StatementExpressionAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReferenceExpressionName}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferenceExpressionName(JasperParser.MethodReferenceExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReferenceExpressionName}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferenceExpressionName(JasperParser.MethodReferenceExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReferenceType}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferenceType(JasperParser.MethodReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReferenceType}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferenceType(JasperParser.MethodReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReferencePrimaryChain}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferencePrimaryChain(JasperParser.MethodReferencePrimaryChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReferencePrimaryChain}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferencePrimaryChain(JasperParser.MethodReferencePrimaryChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReferenceSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferenceSuper(JasperParser.MethodReferenceSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReferenceSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferenceSuper(JasperParser.MethodReferenceSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodReferenceTypeSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReferenceTypeSuper(JasperParser.MethodReferenceTypeSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodReferenceTypeSuper}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReferenceTypeSuper(JasperParser.MethodReferenceTypeSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorReferenceClass}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterConstructorReferenceClass(JasperParser.ConstructorReferenceClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorReferenceClass}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitConstructorReferenceClass(JasperParser.ConstructorReferenceClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorReferenceArray}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterConstructorReferenceArray(JasperParser.ConstructorReferenceArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorReferenceArray}
	 * labeled alternative in {@link JasperParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitConstructorReferenceArray(JasperParser.ConstructorReferenceArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewUnqualified}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewUnqualified(JasperParser.NewUnqualifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewUnqualified}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewUnqualified(JasperParser.NewUnqualifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewAfterDot}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpressionAfterDot}.
	 * @param ctx the parse tree
	 */
	void enterNewAfterDot(JasperParser.NewAfterDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewAfterDot}
	 * labeled alternative in {@link JasperParser#classInstanceCreationExpressionAfterDot}.
	 * @param ctx the parse tree
	 */
	void exitNewAfterDot(JasperParser.NewAfterDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayNewPrimitiveDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayNewPrimitiveDimExprs(JasperParser.ArrayNewPrimitiveDimExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayNewPrimitiveDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayNewPrimitiveDimExprs(JasperParser.ArrayNewPrimitiveDimExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayNewRefDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayNewRefDimExprs(JasperParser.ArrayNewRefDimExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayNewRefDimExprs}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayNewRefDimExprs(JasperParser.ArrayNewRefDimExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitPrimitive}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitPrimitive(JasperParser.ArrayInitPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitPrimitive}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitPrimitive(JasperParser.ArrayInitPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitRef}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitRef(JasperParser.ArrayInitRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitRef}
	 * labeled alternative in {@link JasperParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitRef(JasperParser.ArrayInitRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JasperParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JasperParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JasperParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JasperParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JasperParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JasperParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLambda(JasperParser.ExprLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLambda(JasperParser.ExprLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(JasperParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link JasperParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(JasperParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JasperParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JasperParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JasperParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JasperParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JasperParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JasperParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExprConditional}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExprConditional(JasperParser.AssignExprConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExprConditional}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExprConditional(JasperParser.AssignExprConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExprAssignment}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExprAssignment(JasperParser.AssignExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExprAssignment}
	 * labeled alternative in {@link JasperParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExprAssignment(JasperParser.AssignExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondBinary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterCondBinary(JasperParser.CondBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondBinary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitCondBinary(JasperParser.CondBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondTernary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterCondTernary(JasperParser.CondTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondTernary}
	 * labeled alternative in {@link JasperParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitCondTernary(JasperParser.CondTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryBitAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBitAnd(JasperParser.BinaryBitAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryBitAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBitAnd(JasperParser.BinaryBitAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryMultiplication}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMultiplication(JasperParser.BinaryMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryMultiplication}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMultiplication(JasperParser.BinaryMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryShift}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryShift(JasperParser.BinaryShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryShift}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryShift(JasperParser.BinaryShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAnd(JasperParser.BinaryAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAnd}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAnd(JasperParser.BinaryAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryRelational}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRelational(JasperParser.BinaryRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryRelational}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRelational(JasperParser.BinaryRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOr(JasperParser.BinaryOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOr(JasperParser.BinaryOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryEquality}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryEquality(JasperParser.BinaryEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryEquality}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryEquality(JasperParser.BinaryEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryBitOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBitOr(JasperParser.BinaryBitOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryBitOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBitOr(JasperParser.BinaryBitOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryBitExclusiveOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBitExclusiveOr(JasperParser.BinaryBitExclusiveOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryBitExclusiveOr}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBitExclusiveOr(JasperParser.BinaryBitExclusiveOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAddition}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddition(JasperParser.BinaryAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddition}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddition(JasperParser.BinaryAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryUnary}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryUnary(JasperParser.BinaryUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryUnary}
	 * labeled alternative in {@link JasperParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryUnary(JasperParser.BinaryUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(JasperParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(JasperParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(JasperParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(JasperParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOther}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOther(JasperParser.UnaryOtherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOther}
	 * labeled alternative in {@link JasperParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOther(JasperParser.UnaryOtherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryCastAs}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryCastAs(JasperParser.UnaryCastAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryCastAs}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryCastAs(JasperParser.UnaryCastAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfix(JasperParser.UnaryPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfix}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfix(JasperParser.UnaryPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryBitNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBitNot(JasperParser.UnaryBitNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryBitNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBitNot(JasperParser.UnaryBitNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryLogicalNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicalNot(JasperParser.UnaryLogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryLogicalNot}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicalNot(JasperParser.UnaryLogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryAwait}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAwait(JasperParser.UnaryAwaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryAwait}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAwait(JasperParser.UnaryAwaitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryGo}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryGo(JasperParser.UnaryGoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryGo}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryGo(JasperParser.UnaryGoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryCast}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryCast(JasperParser.UnaryCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryCast}
	 * labeled alternative in {@link JasperParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryCast(JasperParser.UnaryCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(JasperParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(JasperParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#goExpression}.
	 * @param ctx the parse tree
	 */
	void enterGoExpression(JasperParser.GoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#goExpression}.
	 * @param ctx the parse tree
	 */
	void exitGoExpression(JasperParser.GoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastPrimitive}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastPrimitive(JasperParser.CastPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastPrimitive}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastPrimitive(JasperParser.CastPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExpr}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExpr(JasperParser.CastTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExpr}
	 * labeled alternative in {@link JasperParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExpr(JasperParser.CastTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastAs}
	 * labeled alternative in {@link JasperParser#castAsExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastAs(JasperParser.CastAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastAs}
	 * labeled alternative in {@link JasperParser#castAsExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastAs(JasperParser.CastAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExprNode}
	 * labeled alternative in {@link JasperParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExprNode(JasperParser.CastTypeExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExprNode}
	 * labeled alternative in {@link JasperParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExprNode(JasperParser.CastTypeExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExprOrNode}
	 * labeled alternative in {@link JasperParser#castTypeOr}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExprOrNode(JasperParser.CastTypeExprOrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExprOrNode}
	 * labeled alternative in {@link JasperParser#castTypeOr}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExprOrNode(JasperParser.CastTypeExprOrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExprAndNode}
	 * labeled alternative in {@link JasperParser#castTypeAnd}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExprAndNode(JasperParser.CastTypeExprAndNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExprAndNode}
	 * labeled alternative in {@link JasperParser#castTypeAnd}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExprAndNode(JasperParser.CastTypeExprAndNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExprGroup}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExprGroup(JasperParser.CastTypeExprGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExprGroup}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExprGroup(JasperParser.CastTypeExprGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastTypeExprBase}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 */
	void enterCastTypeExprBase(JasperParser.CastTypeExprBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastTypeExprBase}
	 * labeled alternative in {@link JasperParser#castTypeAtom}.
	 * @param ctx the parse tree
	 */
	void exitCastTypeExprBase(JasperParser.CastTypeExprBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JasperParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JasperParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftHandSideExpressionName}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideExpressionName(JasperParser.LeftHandSideExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftHandSideExpressionName}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideExpressionName(JasperParser.LeftHandSideExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftHandSidePrimary}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSidePrimary(JasperParser.LeftHandSidePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftHandSidePrimary}
	 * labeled alternative in {@link JasperParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSidePrimary(JasperParser.LeftHandSidePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#lhsPrimary}.
	 * @param ctx the parse tree
	 */
	void enterLhsPrimary(JasperParser.LhsPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#lhsPrimary}.
	 * @param ctx the parse tree
	 */
	void exitLhsPrimary(JasperParser.LhsPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftHandSideField}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideField(JasperParser.LeftHandSideFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftHandSideField}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideField(JasperParser.LeftHandSideFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftHandSideIndex}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideIndex(JasperParser.LeftHandSideIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftHandSideIndex}
	 * labeled alternative in {@link JasperParser#lhsSuffix}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideIndex(JasperParser.LeftHandSideIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JasperParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JasperParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JasperParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JasperParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatementLocalVariable}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementLocalVariable(JasperParser.BlockStatementLocalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatementLocalVariable}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementLocalVariable(JasperParser.BlockStatementLocalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatementClassDeclaration}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementClassDeclaration(JasperParser.BlockStatementClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatementClassDeclaration}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementClassDeclaration(JasperParser.BlockStatementClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatementStatement}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementStatement(JasperParser.BlockStatementStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatementStatement}
	 * labeled alternative in {@link JasperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementStatement(JasperParser.BlockStatementStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(JasperParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(JasperParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementEmpty(JasperParser.StatementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementEmpty}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementEmpty(JasperParser.StatementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressionStatement}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionStatement(JasperParser.StatementExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressionStatement}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionStatement(JasperParser.StatementExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementGo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementGo(JasperParser.StatementGoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementGo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementGo(JasperParser.StatementGoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementYield}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementYield(JasperParser.StatementYieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementYield}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementYield(JasperParser.StatementYieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAssert}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssert(JasperParser.StatementAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAssert}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssert(JasperParser.StatementAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(JasperParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSwitch}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(JasperParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(JasperParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDo}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(JasperParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(JasperParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(JasperParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(JasperParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementContinue}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(JasperParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(JasperParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementReturn}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(JasperParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementLock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLock(JasperParser.StatementLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementLock}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLock(JasperParser.StatementLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementThrow}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementThrow(JasperParser.StatementThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementThrow}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementThrow(JasperParser.StatementThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementTry}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTry(JasperParser.StatementTryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementTry}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTry(JasperParser.StatementTryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementLabeled}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLabeled(JasperParser.StatementLabeledContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementLabeled}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLabeled(JasperParser.StatementLabeledContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(JasperParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(JasperParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(JasperParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementWhile}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(JasperParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(JasperParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementFor}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(JasperParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDefer}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefer(JasperParser.StatementDeferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDefer}
	 * labeled alternative in {@link JasperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefer(JasperParser.StatementDeferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(JasperParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(JasperParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#loopThenElse}.
	 * @param ctx the parse tree
	 */
	void enterLoopThenElse(JasperParser.LoopThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#loopThenElse}.
	 * @param ctx the parse tree
	 */
	void exitLoopThenElse(JasperParser.LoopThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(JasperParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(JasperParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JasperParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JasperParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JasperParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JasperParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#goStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoStatement(JasperParser.GoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#goStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoStatement(JasperParser.GoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(JasperParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(JasperParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JasperParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JasperParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(JasperParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(JasperParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertSimple}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertSimple(JasperParser.AssertSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertSimple}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertSimple(JasperParser.AssertSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertWithMessage}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertWithMessage(JasperParser.AssertWithMessageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertWithMessage}
	 * labeled alternative in {@link JasperParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertWithMessage(JasperParser.AssertWithMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JasperParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JasperParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JasperParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JasperParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseWhen}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseWhen(JasperParser.SwitchCaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseWhen}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseWhen(JasperParser.SwitchCaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCaseDefault}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseDefault(JasperParser.SwitchCaseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCaseDefault}
	 * labeled alternative in {@link JasperParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseDefault(JasperParser.SwitchCaseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#switchGuard}.
	 * @param ctx the parse tree
	 */
	void enterSwitchGuard(JasperParser.SwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#switchGuard}.
	 * @param ctx the parse tree
	 */
	void exitSwitchGuard(JasperParser.SwitchGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JasperParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JasperParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JasperParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JasperParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JasperParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JasperParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForClassicInitDecl}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 */
	void enterForClassicInitDecl(JasperParser.ForClassicInitDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForClassicInitDecl}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 */
	void exitForClassicInitDecl(JasperParser.ForClassicInitDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForClassicInitExprs}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 */
	void enterForClassicInitExprs(JasperParser.ForClassicInitExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForClassicInitExprs}
	 * labeled alternative in {@link JasperParser#forClassicInit}.
	 * @param ctx the parse tree
	 */
	void exitForClassicInitExprs(JasperParser.ForClassicInitExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForClassicUpdateExprs}
	 * labeled alternative in {@link JasperParser#forClassicUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForClassicUpdateExprs(JasperParser.ForClassicUpdateExprsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForClassicUpdateExprs}
	 * labeled alternative in {@link JasperParser#forClassicUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForClassicUpdateExprs(JasperParser.ForClassicUpdateExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forClassicControl}.
	 * @param ctx the parse tree
	 */
	void enterForClassicControl(JasperParser.ForClassicControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forClassicControl}.
	 * @param ctx the parse tree
	 */
	void exitForClassicControl(JasperParser.ForClassicControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JasperParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JasperParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JasperParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JasperParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JasperParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JasperParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JasperParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JasperParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(JasperParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(JasperParser.LockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatches}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatches(JasperParser.TryCatchesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatches}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatches(JasperParser.TryCatchesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryFinally(JasperParser.TryFinallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryFinally(JasperParser.TryFinallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryWithResources}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResources(JasperParser.TryWithResourcesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryWithResources}
	 * labeled alternative in {@link JasperParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResources(JasperParser.TryWithResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JasperParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JasperParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(JasperParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(JasperParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceTypedVarId}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResourceTypedVarId(JasperParser.ResourceTypedVarIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceTypedVarId}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResourceTypedVarId(JasperParser.ResourceTypedVarIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceTypedBinding}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResourceTypedBinding(JasperParser.ResourceTypedBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceTypedBinding}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResourceTypedBinding(JasperParser.ResourceTypedBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResourceVarLike}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResourceVarLike(JasperParser.ResourceVarLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResourceVarLike}
	 * labeled alternative in {@link JasperParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResourceVarLike(JasperParser.ResourceVarLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoTargetPrimary}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void enterGoTargetPrimary(JasperParser.GoTargetPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoTargetPrimary}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void exitGoTargetPrimary(JasperParser.GoTargetPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoTargetLambda}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void enterGoTargetLambda(JasperParser.GoTargetLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoTargetLambda}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void exitGoTargetLambda(JasperParser.GoTargetLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoTargetBlock}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void enterGoTargetBlock(JasperParser.GoTargetBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoTargetBlock}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void exitGoTargetBlock(JasperParser.GoTargetBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoTargetParen}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void enterGoTargetParen(JasperParser.GoTargetParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoTargetParen}
	 * labeled alternative in {@link JasperParser#goTarget}.
	 * @param ctx the parse tree
	 */
	void exitGoTargetParen(JasperParser.GoTargetParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JasperParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JasperParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInControl}.
	 * @param ctx the parse tree
	 */
	void enterForInControl(JasperParser.ForInControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInControl}.
	 * @param ctx the parse tree
	 */
	void exitForInControl(JasperParser.ForInControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInBinding}.
	 * @param ctx the parse tree
	 */
	void enterForInBinding(JasperParser.ForInBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInBinding}.
	 * @param ctx the parse tree
	 */
	void exitForInBinding(JasperParser.ForInBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#forInDeclBinding}.
	 * @param ctx the parse tree
	 */
	void enterForInDeclBinding(JasperParser.ForInDeclBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#forInDeclBinding}.
	 * @param ctx the parse tree
	 */
	void exitForInDeclBinding(JasperParser.ForInDeclBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link JasperParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JasperParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasperParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JasperParser.CatchTypeContext ctx);
}